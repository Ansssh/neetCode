package arrays.question4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sol = new HashMap<>();
        for(String x : strs){
            char[] temp = x.toCharArray();
            Arrays.sort(temp);
            sol.putIfAbsent(new String(temp), new ArrayList<>());
            sol.get(new String(temp)).add(x);
        }
        return new ArrayList<>(sol.values());
    }
}


public class GroupAnagrams {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.groupAnagrams(new String[]{"cat", "tic", "tac"}));
    }
}
