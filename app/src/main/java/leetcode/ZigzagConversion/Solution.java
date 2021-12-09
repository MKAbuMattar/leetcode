package leetcode.ZigzagConversion;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String convert(String text, int numRows) {
        if(numRows == 1){
            return text;
        }

        Map<Integer, StringBuilder> map = new HashMap<>(numRows);
        int eachRoundNumber = numRows + (numRows-1)-1;

        for(int i=1; i<=numRows;i++){
            map.put(i,new StringBuilder());
        }

        for(int i=1; i<=text.length();i++){
            int key = i%eachRoundNumber;
            key = key==0 ? key+eachRoundNumber : key;
            key = key <=numRows ? key : numRows-(key%numRows);
            map.get(key).append(text.charAt(i-1));
        }

        StringBuilder result = new StringBuilder();

        for(int i=1; i<=numRows; i++){
            result.append(map.get(i));
        }
        return result.toString();
    }
}
