package day12;

class Node1{
    int data;
    Node1 left, right;

    Node1(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class binarytree{

    static Node1 createBinaryTree(int val){
        return new Node1(val);
    }

    public static void main(String args[]){
        Node1 root = createBinaryTree(10);

        root.left = createBinaryTree(5);
        root.right = createBinaryTree(15);

        root.left.left = createBinaryTree(5);
        root.left.right = createBinaryTree(15);

        root.right.left = createBinaryTree(5);
        root.right.right = createBinaryTree(15);
    }
}