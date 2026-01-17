package stack.question3;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> x = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int n1 = x.pop();
                int n2 = x.pop();
                if (tokens[i].equals("+")) {
                    x.push(n1 + n2);
                }else if (tokens[i].equals("-")) {
                    x.push(n2 - n1);
                }else if (tokens[i].equals("*")) {
                    x.push(n1 * n2);
                }else if (tokens[i].equals("/")) {
                    x.push(n2 / n1);
                }
            }else{
                x.push(Integer.parseInt(tokens[i]));
            }
        }
        return x.pop();
    }
}


public class PolishNotation {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.evalRPN(new String[]{"1","2","+","3","*"}));
    }
}
