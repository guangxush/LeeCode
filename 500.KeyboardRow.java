package cn.shgx.easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Given a List of words, return the words that can be typed using letters of alphabet 
 * on only one row's of American keyboard like the image below.
 * Example 1:
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * Note:
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 * Note:
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0;i<strs.length;i++) {
        	for(char c:strs[i].toCharArray()) {
        		map.put(c, i);
        	}
        }//首先将行号和字符通过map匹配起来
        List<String> res = new LinkedList<>();
        for(String w:words) {
        	if(w.equals("")) continue;
        	int index = map.get(w.toUpperCase().charAt(0));
        	for(char c:w.toUpperCase().toCharArray()) {
        		if(map.get(c)!=index) {
        			index = -1;
        			break;
        		}
        	}
        	if(index!=-1)res.add(w);
        }
        return res.toArray(new String[0]);
    }
}
