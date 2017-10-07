package cn.shgx.easy;
/**
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 */
public class Sqrt {
	public static void main(String[] args) {
		System.out.println(mySqrt(9));
		System.out.println(mySqrt(2));
		System.out.println(mySqrt(0));
		System.out.println(mySqrt(12));
	}
	public static int mySqrt(int x) {
		int left = 0;
		int right = x;
		long mid = (left+right)/2;
		while(left<=right) {
		    mid = (left+right)/2;
			if(mid*mid==x)
				return (int) mid;
			if(mid*mid<x) {
				left = (int) (mid+1);
			}else {
				right = (int) (mid-1);
			}
		}
		return (int) right;
	}
}
