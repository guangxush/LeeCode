package cn.shgx.easy;

import java.util.Stack;

/**
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 */
public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
		System.out.println(reverseString1("hello"));
		System.out.println(reverseString2("hello"));
	}
	public static String reverseString(String s) {
        char[] c = s.toCharArray();
        for(int i=0;i<c.length/2;i++) {
        	char temp = c[i];
        	c[i] = c[c.length-1-i];
        	c[c.length-1-i] = temp;
        }
        return String.valueOf(c);
    }
	public static String reverseString1(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
        	stack.push(s.charAt(i));
        }
        String r = "";
        for(int i=0;i<s.length();i++) {
           r+=stack.pop();
        }
        while(!stack.isEmpty()) {
            r+=stack.pop();
         }
        return r;
    }
	public static String reverseString2(String s) {
       return new StringBuilder(s).reverse().toString();
    }
}
