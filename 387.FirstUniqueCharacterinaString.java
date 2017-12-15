package cn.shgx.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *Given a string, find the first non-repeating character in it and return it's index. 
 *If it doesn't exist, return -1.
 *Examples:
 *s = "leetcode"
 *return 0.
 *s = "loveleetcode",
 *return 2.
 */
public class FirstUniqueCharacterinaString {
	 public int firstUniqChar(String s) {
	    int m[] = new int[26];
	    int len = s.length();
	    for(int i=0;i<len;i++) {
	    	m[s.charAt(i)-'a']++;
	    }
	    for(int i=0;i<len;i++) {
	    	if(m[s.charAt(i)-'a']==1) {
	    		return i;
	    	}
	    }
	    return -1;
	 }
	 public int firstUniqChar1(String s) {
	    Map<Character,Integer> map = new HashMap<Character,Integer>();
	    int len = s.length();
	    for(int i=0;i<len;i++) {
	    	if(map.containsKey(s.charAt(i))) {
	    		map.put(s.charAt(i), (map.get(s.charAt(i)))+1);
	    	}else {
	    		map.put(s.charAt(i), 1);
	    	}
	    }
	    for(int i=0;i<len;i++) {
	    	if(map.get(s.charAt(i))==1) {
	    		return i;
	    	}
	    }
	    return -1;
	 }
}
