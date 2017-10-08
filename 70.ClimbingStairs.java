package cn.shgx.easy;
/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 */
public class ClimbingStairs {
	public static void main(String[] args) {
		System.out.println(climbStairs(0));
		System.out.println(climbStairs(1));
		System.out.println(climbStairs(2));
		System.out.println(climbStairs(3));
		System.out.println(climbStairs(4));
	}
	public static int climbStairs(int n) {
         int[] f = new int[n+3];
         f[0]=0;
         f[1]=1;
         f[2]=2;
         for(int i=3;i<=n;i++) {
        	 f[i]=f[i-1]+f[i-2];
         }
         return f[n];
    }
}
