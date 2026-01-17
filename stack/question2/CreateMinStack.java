package stack.question2;

import java.util.Stack;

class MinStack {
    Stack<Integer> x;
    Stack<Integer> min;
    public MinStack() {
        x = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if (min.isEmpty()) {
            min.push(val);
            min.push(val);
        }else{
            int top = min.pop();
            int currMin = min.peek() < val ? min.peek() : val;
            min.push(top);
            min.push(currMin);
            min.push(val); 
        }
        x.push(val);
    }
    
    public void pop() {
        x.pop();
        min.pop();
        min.pop();
    }
    
    public int top() {
        return x.peek();
    }
    
    public int getMin() {
        int top = min.pop();
        int d = min.peek();
        min.push(top);
        return d;
    }
}

public class CreateMinStack {
    public static void main(String[] args) {
        MinStack x = new MinStack();
        x.push(5);
        x.push(8); 
        x.push(2);
        x.push(10);
        x.pop();
        x.pop();
        System.out.println(x.getMin());
        
    }
}
