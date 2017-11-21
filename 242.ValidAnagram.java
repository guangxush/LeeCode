package cn.shgx.easy;

import java.util.Arrays;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return String.valueOf(sArr).equals(String.valueOf(tArr));
    }
	public boolean isAnagram1(String s, String t) {
		if(s.length()!=toString().length()) return false;
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		int[] temp = new int[128];
		for(char c : sArr) {
			temp[c]++;
		}
		for(char c :tArr) {
			temp[c]--;
			if(temp[c]<0)
				return false;
		}
		return true;
    }
}
