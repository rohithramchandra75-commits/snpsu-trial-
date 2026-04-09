package Module11;

import java.util.*;

class MinStack {

    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();

    public void push(int val){

        stack.push(val);

        if(minStack.isEmpty() || val<=minStack.peek())
            minStack.push(val);
    }

    public void pop(){

        if(stack.pop().equals(minStack.peek()))
            minStack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args){

        MinStack obj=new MinStack();

        obj.push(3);
        obj.push(5);
        obj.push(2);

        System.out.println(obj.getMin());
    }
}