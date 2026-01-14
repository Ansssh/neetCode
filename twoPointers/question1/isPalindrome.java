package twoPointers.question1;

class Solution {
    public boolean isPalindrome(String s) {
        String p = "";
        for(char x : s.toLowerCase().toCharArray()){
            if (Character.isLetterOrDigit(x)) {
                p += "" + x;
            }
        }
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) != p.charAt(p.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}


public class IsPalindrome {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.isPalindrome("racecar"));
    }
}

