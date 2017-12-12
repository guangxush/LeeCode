package cn.shgx.easy;
/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * Example:
 * Given a = 1 and b = 2, return 3.
 */
public class SumofTwoIntegers {
	 public int getSum(int a, int b) {
	     if(a==0) return b;
	     int x = a^b;
	     int c = (a&b)<<1;
	     return getSum(c, x);
	 }
	 public int getSum1(int a, int b) {
	    while(a!=0) {
	    	int x = a^b;
	    	a = (a&b)<<1;
	    	b = x;
	    }
	    return b;
	 }
}
