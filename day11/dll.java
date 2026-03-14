package day11;

class Node1 {
    int data;
    Node1 next;
    Node1 prev;

    Node1(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}

public class dll {
    Node1 head;
    Node1 tail;
    int size;

    public dll(){
        head = null;
        tail = null;
        size = 0;
    }

    // Insert at head
    void insertAtHead(int val){
        Node1 newnode = new Node1(val);

        if(head == null){
            head = tail = newnode;
        }
        else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
        size++;
    }

    // Delete at head
    void deleteAtHead(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if(head != null){
            head.prev = null;
        }
        else{
            tail = null;
        }

        size--;
    }

    // Display list
    void display(){
        Node1 temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

class driver2{
    public static void main(String[] args){
        dll obj = new dll();

        obj.insertAtHead(1);
        obj.insertAtHead(2);
        obj.insertAtHead(3);
        obj.insertAtHead(4);
        obj.insertAtHead(5);

        obj.deleteAtHead();

        obj.display();
    }
}