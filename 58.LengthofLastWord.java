package cn.shgx.easy;
/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of 
 * non-space characters only.
 * For example,
 * Given s = "Hello World",
 * return 5.
 */
public class LengthofLastWord {
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World "));
		System.out.println(lengthOfLastWord2("a"));
	}
    public static int lengthOfLastWord(String s) {
        if(s==null||s=="") {
        	return 0;
        }
        String str = s.trim();
        int count = 0;
        for(int i=str.length()-1;i>=0;i--) {
        	if(str.charAt(i)!=' ') {
        		count++;
        	}else {
        		break;
        	}
        }
        return count;
    }
    public static int lengthOfLastWord2(String s) {
        return s.trim().length()-1-s.lastIndexOf(" ");
    }
}
