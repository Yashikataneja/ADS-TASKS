// package stacks;

import java.util.Stack;
public class problem155 {
    private Stack<Integer>stack;
    private Stack<Integer>minStack;
    public problem155(){
        stack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int val){
        stack.push(val);
        if(minStack.isEmpty()||val<=minStack.peek()){
            minStack.push(val);
        }else{
            minStack.push(minStack.peek());
        }
    }

    public void pop(){
        if(!stack.isEmpty()){
            stack.pop();
            minStack.pop();
        }
    }
    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        problem155 p=new problem155();
        p.push(-2);
        p.push(0);
        p.push(-3);
        System.out.println(p.getMin());
        p.pop();
        System.out.println(p.top());
        System.out.println(p.getMin());

    }

}
