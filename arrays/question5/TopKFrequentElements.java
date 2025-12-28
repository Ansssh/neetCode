package arrays.question5;

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new TreeMap<>();
        Set<Integer> numSet = new HashSet<>();
        int[] sol = new int[k];
        for(int x : nums){
            frequency.put(x, frequency.getOrDefault(x, 0) + 1);
            numSet.add(x);
        }

        int[][] freqMap = new int[numSet.size()][2];
        int p = 0;
        for (int x : numSet) {
            freqMap[p][0] = x;
            freqMap[p][1] = frequency.get(x);
            p++;
        }

        Arrays.sort(freqMap, (a,b)-> b[1] - a[1]);

        for (int i = 0; i < k; i++) {
            sol[i] = freqMap[i][0];
        }

        return sol;
    }
}

public class TopKFrequentElements {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println("Sol - " + Arrays.toString(x.topKFrequent(new int[]{9,5,1,9,1,3}, 2)));
    }    
}
