package cn.shgx.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *Write a function that takes a string as input and reverse only the vowels of a string.
 *Example 1:
 *Given s = "hello", return "holle".
 *Example 2:
 *Given s = "leetcode", return "leotcede".
 *Note:
 *The vowels does not include the letter "y".
 */
public class ReverseVowelsofaString {
	 public String reverseVowels(String s) {
	      if(s==null||s.length()==0) return s;
	      String vowels = "aeiouAEIOU";
	      char[] chars = s.toCharArray();
	      int start = 0;
	      int end = s.length()-1;
	      while(start<end) {
	    	  while(start<end&&!vowels.contains(chars[start]+"")){
	    		  start++;
	    	  }
	    	  while(start<end&&!vowels.contains(chars[end]+"")) {
	    		  end--;
	    	  }
	    	  char temp = chars[start];
	    	  chars[start] = chars[end];
	    	  chars[end] = temp;
	    	  start++;
	    	  end--;
	      }
	      return new String(chars);
	 }
	 public String reverseVowels1(String s) {
	        char[] list=s.toCharArray();
	        Set<Character> set = new HashSet<>(Arrays.asList(new Character[]{'a','e','i','o','u','A','E','I','O','U'}));
	        for (int i=0, j=list.length-1; i<j; ) {
	            if (!set.contains(list[i])) {
	                i++;
	                continue;
	            }
	            if (!set.contains(list[j])) {
	                j--;
	                continue;
	            }
	            char temp=list[i];
	            list[i]=list[j];
	            list[j]=temp;
	            i++;
	            j--;
	        }
	        return String.valueOf(list);
	    }
}
