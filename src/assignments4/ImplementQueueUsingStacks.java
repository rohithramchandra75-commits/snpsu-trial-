package Module11;


// LeetCode 232 - Implement Queue using Stacks

import java.util.Stack;

public class ImplementQueueUsingStacks {

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {

        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }

        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {

        ImplementQueueUsingStacks q = new ImplementQueueUsingStacks();

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.empty());
    }
}