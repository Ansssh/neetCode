package slidingWindow.question3;

class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        int left = 0;
        int maxFreqInWindow = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            counts[s.charAt(right) - 'A']++;
            maxFreqInWindow = Math.max(maxFreqInWindow, counts[s.charAt(right) - 'A']);
            while ((right - left + 1) - maxFreqInWindow > k) {
                counts[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}

public class LongestReplacement {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.characterReplacement(
                "KRSCDCSONAJNHLBMDQGIFCPEKPOHQIHLTDIQGEKLRLCQNBOHNDQGHJPNDQPERNFSSSRDEQLFPCCCARFMDLHADJADAGNNSBNCJQOF",
                4));
    }
}

// class Solution {
// public int characterReplacement(String s, int k) {
// HashMap<Character, Integer> freq = new HashMap<>();
// for (int i = 0; i < s.length(); i++) {
// freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
// }
// int maxFrequency = 0;
// char candidate = 'a';
// for (char c : freq.keySet()) {
// if (freq.get(c) > maxFrequency) {
// candidate = c;
// maxFrequency = freq.get(c);
// }
// }
// int localK = k;
// int l = 0;
// int currFrequency = 0;
// int largestLength = 0;
// for (int i = 0; i < s.length(); i++) {
// if (s.charAt(i) != candidate) {
// localK--;
// }
// while (localK < 0) {
// if (s.charAt(l) != candidate) {
// localK++;
// }
// currFrequency--;
// l++;
// }
// currFrequency++;
// largestLength = Math.max(largestLength, currFrequency);
// }

// return largestLength;
// }
// }