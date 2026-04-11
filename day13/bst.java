package day13;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class bst {
    Node root;

    public bst() {
        root = null;
    }

    // --- INSERTION ---
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // --- SEARCH ---
    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node root, int data) {
        if (root == null) return false;
        if (root.data == data) return true;
        return (data < root.data) ? searchRec(root.left, data) : searchRec(root.right, data);
    }

    // --- DELETION ---
    public void remove(int data) {
        root = removeRec(root, data);
    }

    private Node removeRec(Node root, int data) {
        if (root == null) return null;

        if (data < root.data) {
            root.left = removeRec(root.left, data);
        } else if (data > root.data) {
            root.right = removeRec(root.right, data);
        } else {
            // Node found
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Node with two children: Get inorder successor (smallest in right subtree)
            root.data = minValue(root.right);
            root.right = removeRec(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // --- SUCCESSOR ---
    public Node getSuccessor(int data) {
        Node current = findNode(root, data);
        if (current == null) return null;

        // Case 1: Node has right subtree -> Successor is min in right subtree
        if (current.right != null) {
            Node temp = current.right;
            while (temp.left != null) temp = temp.left;
            return temp;
        }

        // Case 2: No right subtree -> Successor is deepest ancestor for which node is in left subtree
        Node successor = null;
        Node ancestor = root;
        while (ancestor != current) {
            if (current.data < ancestor.data) {
                successor = ancestor;
                ancestor = ancestor.left;
            } else {
                ancestor = ancestor.right;
            }
        }
        return successor;
    }

    private Node findNode(Node root, int data) {
        if (root == null || root.data == data) return root;
        return (data < root.data) ? findNode(root.left, data) : findNode(root.right, data);
    }

    // --- TRAVERSAL (To see results) ---
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}

class drive {
    public static void main(String[] args) {
        bst tree = new bst();
        tree.insert(100);
        tree.insert(200);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        System.out.println("Root: " + tree.root.data);
        System.out.println("Tree Inorder: ");
        tree.inorder();

        System.out.println("Search 100: " + tree.search(100));

        Node succ = tree.getSuccessor(40);
        System.out.println("Successor of 40: " + (succ != null ? succ.data : "None"));

        System.out.println("Deleting 30...");
        tree.remove(30);
        System.out.print("Tree after deleting 30: ");
        tree.inorder();
    }
}