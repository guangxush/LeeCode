package cn.shgx.medium;
import java.util.HashMap;
/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. 
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashMap<Character, Integer>map = new HashMap<Character,Integer>();
        int max = 0;
        for(int i=0,j=0;i<s.length();i++) {
        	if(map.containsKey(s.charAt(i))) {
        		j=Math.max(j, map.get(s.charAt(i))+1);
        	}
        	map.put(s.charAt(i), i);
        	max = Math.max(max, i-j+1);
        }
        return max;
    }
}
/*
    "滑动窗口" 
    比方说 abcabccc 当你右边扫描到abca的时候你得把第一个a删掉得到bca，
    然后"窗口"继续向右滑动，每当加到一个新char的时候，左边检查有无重复的char，
    然后如果没有重复的就正常添加，
    有重复的话就左边扔掉一部分（从最左到重复char这段扔掉），在这个过程中记录最大窗口长度
*/