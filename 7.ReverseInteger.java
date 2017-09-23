package cn.shgx.easy;
/**
 * 
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 */
public class ReverseInteger {
	public static int reverse(int x) {
		long result = 0;
		if(x>=0){
			while(x!=0){
				result=result*10+(x%10);
				x=x/10;
			}
		}else if(x<0){
			x=-x;
			while(x!=0){
				result=result*10+(x%10);
				x=x/10;
			}
			result = -result;
		}
		if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE) {
			return 0;
		}
		return (int)result;
	}
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(reverse(Integer.MAX_VALUE));
	}
}
