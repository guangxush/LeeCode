package cn.shgx.easy;

import java.util.HashSet;
import java.util.Set;

/**
 *Given a string which consists of lowercase or uppercase letters, 
 *find the length of the longest palindromes that can be built with those letters.
 *This is case sensitive, for example "Aa" is not considered a palindrome here.
 *Note:
 *Assume the length of given string will not exceed 1,010.
 *Example:
 *Input:
 *"abccccdd"
 *Output:
 *7
 *Explanation:
 *One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class LongestPalindrome {
	public int longestPalindrome(String s) {
        int[] cnt = new int[58];
        int max = 0,len = 0;
        for(int i=0;i<s.length();i++) {
        	cnt[s.charAt(i)-'A']++;
        }
        for(int i=0;i<58;i++) {
        	if(cnt[i]%2==0) {
        		len+=cnt[i];
        	}else {
        		if(cnt[i]>max) {
        			len+=max-1;
        			max = cnt[i];
        		}else {
        			len=len+cnt[i]-1;
        		}
        	}
        }
        return max==0?len:len+max+1;
    }
	public int longestPalindrome1(String s) {
        Set<Character> set  = new HashSet<>();
        int count = 0;
        for(char c :s.toCharArray()) {
        	if(set.contains(c)) {
        		set.remove(c);
        		count+=2;
        	}else {
        		set.add(c);
        	}
        }
        return count+(set.size()>0?1:0);
    }
}
