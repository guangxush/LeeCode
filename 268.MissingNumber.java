package cn.shgx.easy;
/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * Note:
 * Your algorithm should run in linear runtime complexity. 
 * Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {
	public int missingNumber(int[] nums) {
		 if(nums == null || nums.length == 0) {
	            return 0;
	     }
		 int sum = 0;
		 for(int num :nums) {
			 sum+=num;
		 }
		 int n = nums.length;
		 return (n*(n+1)/2)-sum;
    }
}
