package cn.shgx.easy;
/**
 *Given a word, you need to judge whether the usage of capitals in it is right or not.
 *We define the usage of capitals in a word to be right when one of the following cases holds:
 *All letters in this word are capitals, like "USA".
 *All letters in this word are not capitals, like "leetcode".
 *Only the first letter in this word is capital if it has more than one letter, like "Google".
 *Otherwise, we define that this word doesn't use capitals in a right way.
 *Example 1:
 *Input: "USA"
 *Output: True
 *Example 2:
 *Input: "FlaG"
 *Output: False
 *Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        char[] cword = word.toCharArray();
        if('a'<=cword[0]&&'z'>=cword[0]) {
        	for(int i=1;i<cword.length;i++) {
        		if('a'>cword[i]||'z'<cword[i]) {
        			return false;
        		}
        	}
        }else if('A'<=cword[0]&&'Z'>=cword[0]) {
        	if(cword.length==1) {
        		return true;
        	}
        	if('a'<=cword[1]&&'z'>=cword[1]){
        		for(int i=2;i<cword.length;i++) {
            		if('a'>cword[i]||'z'<cword[i]) {
            			return false;
            		}
            	}
        	}else if('A'<=cword[1]&&'Z'>=cword[1]){
        		for(int i=2;i<cword.length;i++) {
            		if('A'>cword[i]||'Z'<cword[i]) {
            			return false;
            		}
            	}
        	}else {
        		return false;
        	}
        }else {
        	return false;
        }
        return true;
    }
    public boolean detectCapitalUse1(String word) {
    	int len = word.length();
    	String up = word.toLowerCase();
    	String low = word.toUpperCase();
    	if(word.equals(up)||word.equals(low)) {
    		return true;
    	}
    	String last = word.substring(1, len);
    	if(last.toLowerCase().equals(last)) {
    		return true;
    	}
    	return false;
    }
    public boolean detectCapitalUse2(String word) {
    	int count = 0;
    	char[] cword = word.toCharArray();
    	for(char c :cword) {
    		if(Character.isUpperCase(c)) {
    			count++;
    		}
    	}
    	return count==0||count==word.length()||Character.isUpperCase(cword[0])&&count==1;
    }
}
