package day10;

public class stack1 {
    int[] arr;
    int top;
    int size;

    stack1(int size){
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    void push(int val){
        if(top == size - 1){
            System.out.println("stack overflown");
            return;
        }
        top++;
        arr[top] = val;
    }

    void pop(){
        if(top == -1){
            System.out.println("stack underflown");
            return;
        }
        arr[top] = 0;
        top--;
    }

    int Top(){
        if(top == -1){
            System.out.println("Stack underflown");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        return top == -1;
    }
}

class Driver2{
    public static void main(String[] args) {
        stack1 st = new stack1(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.pop();
        st.pop();
        st.pop();
        st.pop();


        while(!st.isEmpty()){
            System.out.println(st.Top());
            st.pop();
        }
    }
}