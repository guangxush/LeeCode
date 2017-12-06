package cn.shgx.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *Given two strings s and t, determine if they are isomorphic.
 *Two strings are isomorphic if the characters in s can be replaced to get t.
 *All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 *For example,
 *Given "egg", "add", return true.
 *Given "foo", "bar", return false.
 *Given "paper", "title", return true.
 */
public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
        if((s==null&&t==null)||(s.length()==0&&t.length()==0)) return true;
        if((s==null||t==null)||(s.length()!=t.length())) return false;
        Map<Character,Character> map= new HashMap<>();
        Set<Character> set = new HashSet<>(t.length());
        char sChar,tChar;
        for(int i=0;i<s.length();i++) {
        	sChar = s.charAt(i);
        	tChar = t.charAt(i);
        	if(!map.containsKey(sChar)) {
        		if(set.contains(tChar)) {
        			return false;
        		}else {
        			map.put(s.charAt(i), t.charAt(i));
        			set.add(tChar);
        		}
        	}else {
        		if(map.get(sChar)!=tChar) {
        			return false;
        		}
        	}
        }
        return true;
    }
	 public boolean isIsomorphic1(String s1, String s2) {
	        int[] m = new int[512];
	        for (int i = 0; i < s1.length(); i++) {
	            if (m[s1.charAt(i)] != m[s2.charAt(i)+256]) return false;
	            m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;
	        }
	        return true;
	    }
}
