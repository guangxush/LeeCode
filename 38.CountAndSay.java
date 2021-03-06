package cn.shgx.easy;
/**
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the count-and-say sequence.
 * Note: Each term of the sequence of integers will be represented as a string.
 */
public class CountAndSay {
	public static void main(String[] args) {
		System.out.println(countAndSay(4));
	}
    public static String countAndSay(int n) {
    	String str = "1";
    	for(int i=1;i<n;i++){
    		String temp = "";
    		int count = 1;
    		for(int j=0;j<str.length()-1;j++) {
    			if(str.charAt(j)==str.charAt(j+1)) {
    				count++;
    			}else {
    				temp = temp+count+str.charAt(j);
    				count = 1;
    			}
    		}
    		str = temp+count+str.charAt(str.length()-1);
    	}
        return str;
    }
}
