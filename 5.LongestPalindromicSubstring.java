package cn.shgx.medium;
/**
 * Given a string s, find the longest palindromic substring in s. 
 * You may assume that the maximum length of s is 1000.
 * Example 1:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 * Input: "cbbd"
 * Output: "bb"
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String max = "";
        for(int i=0;i<s.length();i++) {
        	String s1 = extend(s,i,i),s2 = extend(s,i,i+1);
        	if(s1.length()>max.length()) max=s1;
        	if(s1.length()>max.length()) max=s2;
        }
        return max;
    }
    public String extend(String s,int i,int j) {
    	for(;i>=0&&j<s.length();i--,j++) {
    		if(s.charAt(i)!=s.charAt(j))
    			break;
    	}
    	return s.substring(i+1, j);
    }
}
