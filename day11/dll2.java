package day11;

class Node2 {
    int data;
    Node2 next;
    Node2 prev;

    Node2(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

class DoublyLinkedList {
    Node2 head;

    void insert(int data) {
        Node2 newNode = new Node2(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node2 temp = head;   // corrected

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    void rotate(int n) {
        if (head == null) return;

        Node2 temp = head;
        int count = 1;

        while (count < n && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp == null) return;

        Node2 nth = temp;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;
        head.prev = temp;

        head = nth.next;
        head.prev = null;

        nth.next = null;
    }

    void print() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class dll2 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.print();

        list.rotate(2);

        list.print();
    }
}