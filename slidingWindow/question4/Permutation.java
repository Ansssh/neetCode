package slidingWindow.question4;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false; // handle edge cases
        int[] s1Arr = new int[26];
        for (int i = 0; i < s1.length(); i++) 
            s1Arr[s1.charAt(i) - 'a']++; // populate the reference array
        int[] s2Arr = new int[26];
        int left = 0;
        for (int i = 0; i < s2.length(); i++) {
            s2Arr[s2.charAt(i) - 'a']++; // add the element to current array
            while (s2Arr[s2.charAt(i) - 'a'] > s1Arr[s2.charAt(i) - 'a']) { // check if element exceeds the frequency from reference array, if yes, shrink the window and decrease the frequency from left
                s2Arr[s2.charAt(left) - 'a']--;
                left++;
            }
            if (i - left + 1 == s1.length()) { // if the length becomes same as reference string, it means the frequency matched all the way
                return true;
            }
        }
        return false;
    }
}

public class Permutation {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.checkInclusion("adc", "dcda"));
    }
}
