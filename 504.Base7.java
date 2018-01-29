package cn.shgx.easy;
/**
 *Given an integer, return its base 7 string representation.
 *Example 1:
 *Input: 100
 *Output: "202"
 *Example 2:
 *Input: -7
 *Output: "-10"
 *Note: The input will be in range of [-1e7, 1e7].
 */
public class Base7 {
	public static void main(String[] args) {
		System.out.println(convertToBase71(100));
	}
    public static String convertToBase7(int num) {
        if(num==0) return "0";
        String res = "";
        boolean positive = num>0;
        while(num!=0) {
        	res = Math.abs(num%7)+res;
        	num /= 7;
        }
        return positive?res:"-"+res;
    }
    public static String convertToBase71(int num) {
        if(num<0) return "-"+convertToBase71(-num);
        if(num<7) return ""+num;
        return ""+convertToBase71(num/7)+(num%7);
    }
}
