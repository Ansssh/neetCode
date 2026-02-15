package slidingWindow.question5;

import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        HashMap<Character, Integer> freqMap = new HashMap<>();
        HashMap<Character, Integer> refMap = new HashMap<>();
        for (char c : t.toCharArray()) freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

        int left = 0;
        int right = 0;
        int[] res = {-1, -1};
        int have = 0;
        int need = freqMap.size();
        int minLen = s.length() + 1;
        while (right < s.length()) {
            refMap.put(s.charAt(right), refMap.getOrDefault(s.charAt(right), 0) + 1);

            if (freqMap.containsKey(s.charAt(right)) && refMap.get(s.charAt(right)) == freqMap.get(s.charAt(right))) {
                have++;
            }
            while(have == need) {
                int len = right - left + 1;
                if (minLen > len) {
                    minLen = right - left + 1;
                    res[0] = left;
                    res[1] = right;
                }
                refMap.put(s.charAt(left), refMap.get(s.charAt(left)) - 1);
                if (freqMap.containsKey(s.charAt(left)) && refMap.get(s.charAt(left)) < freqMap.get(s.charAt(left))) {
                    have--;
                }
                left++;
            }
            right++;
        }
        return minLen == s.length() + 1 ? "" : s.substring(res[0], res[1] + 1);
    }
}


public class MinWindowSubString {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.minWindow("OUZODYXAZV", "XZYZ"));
    }    
}
