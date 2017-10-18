package cn.shgx.easy;
/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {
	public static void main(String args[]) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome(" "));
		System.out.println(isPalindrome("0P"));
	}
	public static boolean isPalindrome(String s) {
        if(s.isEmpty()) {
        	return true;
        }
        int i = 0;
        int j = s.length()-1;
        while(i<=j) {
        	while((i<j)&&(!isNumAlphanumeric(s.charAt(i)))) {
        		i++;
        	}
        	while((i<j)&&(!isNumAlphanumeric(s.charAt(j)))) {
        		j--;
        	}
        	if(toLower(s.charAt(i++))!=toLower(s.charAt(j--))) {
        		return false;
        	}
        }
        return true;
    }
	//大写字母转换成小写字母
	public static char toLower(char c) {
		if('A'<=c&&c<='Z') {
			return (char) ('a'+c-'A');
		}
		return c;
	}
	//判断是否为字母
	public static boolean isNumAlphanumeric(char c) {
		if(('0'<=c&&c<='9')||('a'<=c&&c<='z')||('A'<=c&&c<='Z')) {
			return true;
		}
		return false;
	}
}
