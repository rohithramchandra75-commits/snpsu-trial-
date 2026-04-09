package day12;

class Queue {
    int arr[];
    int front;
    int back;
    int size;

    Queue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        back = -1;
    }

    void push(int value){
        if(back == size - 1){
            System.out.println("Queue is full");
            return;
        }

        if(front == -1){
            front = 0;
        }

        back++;
        arr[back] = value;
    }

    int pop(){
        if(front == -1){
            System.out.println("Queue is empty");
            return 0;
        }

        front++;

        if(front > back){
            front = -1;
            back = -1;
        }
        return 0;
    }

    int peek(){
        if(front == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty(){
        return front == -1;
    }
}

class driver3 {
    public static void main(String[] args) {
        Queue q = new Queue(10);

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        System.out.println(q.peek());

        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.isEmpty());
    }
}