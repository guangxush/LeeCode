package cn.shgx.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing digits from 2-9 inclusive, 
 * return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * Note that 1 does not map to any letters.
 * Example:
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 */
public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();
        if(digits==null||digits.length()==0) return result;
        result.add("");//用于后面的拼接
        for(int i=0;i<digits.length();i++) {
        	result=combine(digitletter[digits.charAt(i)-'0'],result);
        }
        return result;
    }
    private List<String> combine(String digit,List<String> list){
    	List<String> result = new ArrayList<>();
    	//例如输入的数字为23，那么分别对应的字符串为"abc","def"
        //第一次循环，拿到数字2，那么对应的digit为"abc"，那么这里对字符串进行遍历，list中现在只有""，那么结果是["a","b","c"]
        //第二次循环进来，拿到的数字是2，那么对应的digit是"def"，这里外面的for循环第一次拿到"d"，进入里面的循环，遍历["a","b","c"]，分别拼接为
        //["ad","bd","cd"]，下一次拼接完结果是["ad","bd","cd","bd","be","bf"]，最后一次是["ad","bd","cd","bd","be","bf","cd","ce","cf"]
    	for(int i=0;i<digit.length();i++) {
    		for(String str:list) {
    			result.add(str+digit.charAt(i));
    		}
    	}
    	return result;
    }
}
