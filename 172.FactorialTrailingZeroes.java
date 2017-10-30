package cn.shgx.easy;
/**
 *Given an integer n, return the number of trailing zeroes in n!.
 *Note: Your solution should be in logarithmic time complexity.
 */
public class FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
        int count = 0;
        while(n>0) {
        	count += n/5;
        	n = n/5;
        }
        return count;
    }
	public int trailingZeroes1(int n) {
        return n==0?0:n/5+trailingZeroes1(n/5);
    }
}
