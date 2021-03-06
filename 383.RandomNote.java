package cn.shgx.easy;
/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, 
 * write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 *  write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 *  Each letter in the magazine string can only be used once in your ransom note.
 */
public class RandomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for(int i=0;i<magazine.length();i++) {
        	arr[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++) {
        	if(--arr[ransomNote.charAt(i)-'a']<0) {
        		return false;
        	}
        }
        return true;
    }
}
