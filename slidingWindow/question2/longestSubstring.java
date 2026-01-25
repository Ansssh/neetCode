package slidingWindow.question2;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> x = new HashSet<>();
        int maxCount = 0;
        int l = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            while (x.contains(s.charAt(i))) {
                x.remove(s.charAt(l));
                l++;
                count--;
            }
            x.add(s.charAt(i));
            count++;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}


public class longestSubstring {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.lengthOfLongestSubstring("dvdf"));
    }
}
