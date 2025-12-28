import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] x = s.toCharArray();
        char[] y = t.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        for(int i = 0; i < x.length; i++){
            if(x[i] != y[i]){
                return false;
            }
        }
        return true;
    }
}

public class Q2_validAnagrams {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.isAnagram("racecar", "carrace"));
    }
}
