package stack.question1;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> x = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                x.push(c);
            }else{
                if (x.isEmpty()) {
                    return false;
                }else if ((x.peek() == '{' && c == '}') || (x.peek() == '(' && c == ')') || (x.peek() == '[' && c == ']')) {
                    x.pop(); 
                }else{
                    return false;
                }
            }
        }
        if (x.size() == 0) {
            return true;
        }else{
            return false;
        }
    }
}


public class ValidParenthesis {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.isValid("]]"));
    }    
}
