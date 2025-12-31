package arrays.question6;

import java.util.*;

class Solution {

    public String encode(List<String> strs) {
        char psi = 'Ψ';
        String sol = "";
        for (String x : strs) {
            sol = sol + x;
            sol = sol + psi;
        }
        return sol;
    }

    public List<String> decode(String str) {
        char psi = 'Ψ';
        char[] sui = str.toCharArray();
        System.out.println(Arrays.toString(sui));
        List<String> res = new ArrayList<>();
        String temp = "";
        for (char tuti : sui) {
            if (tuti == psi) {
                res.add(temp);
                temp = "";
            }else{
                temp = temp + tuti;
            }
        }
        return res;
    }
}

public class EncodeAndDecodeString {
    public static void main(String[] args) {
        
    }
}

