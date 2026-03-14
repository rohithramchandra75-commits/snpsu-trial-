package day11;

public class newsll2 {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    newsll2() {
        head = null;
    }

    // Insert at Head
    void insertAtHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    // Insert at Tail
    void insertAtTail(int val) {
        Node n = new Node(val);

        if (head == null) {
            head = n;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n;
    }

    // Get Size
    int getSize() {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    // Insert at Position
    void insertAtPos(int val, int pos) {

        int size = getSize();
        Node n = new Node(val);

        if (pos < 0 || pos > size) {
            System.out.println("Invalid Position Given");
            return;
        }

        if (pos == 0) {
            n.next = head;
            head = n;
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        n.next = temp.next;
        temp.next = n;
    }

    // Display
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // Main Method
    public static void main(String[] args) {

        newsll2 sll = new newsll2();

        sll.insertAtHead(10);
        sll.insertAtTail(20);
        sll.insertAtTail(30);
        sll.insertAtTail(40);
        sll.insertAtTail(50);
        sll.insertAtTail(60);

        sll.insertAtPos(35, 3);
        sll.insertAtPos(35, 20);
        sll.insertAtPos(5, 0);
        sll.insertAtPos(35, -3);

        sll.display();
    }
}