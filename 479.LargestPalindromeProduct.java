package cn.shgx.easy;
/*
 * Find the largest palindrome made from the product of two n-digit numbers.
 * Since the result could be very large, you should return the largest palindrome mod 1337.
 * Example:
 * Input: 2
 * Output: 987
 * Explanation: 99 x 91 = 9009, 9009 % 1337 = 987
 * Note:
 * The range of n is [1,8].
 */
public class LargestPalindromeProduct {
    public int largestPalindrome(int n) {
        if(n==1) return 9;
        int high = (int)Math.pow(10, n)-1,low = high/10;
        for(int i=high;i>low;i--) {
        	long palindrom = toLong(i);
        	for(long j = high;j>low;j--) {
        		if(palindrom/j>high) {
        			break;
        		}
        		if(palindrom%j==0) {
        			return (int)(palindrom%1337);
        		}
        	}
        }
        return 0;
    }
    private Long toLong(int number) {
    	StringBuffer buffer = new StringBuffer();
    	String str = buffer.append(number).reverse().toString();
    	return Long.valueOf(number+str);
    }
}
