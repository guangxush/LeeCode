package cn.shgx.easy;
/**
 * Find the contiguous subarray within an array 
 * (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6. 
 *  ±º‰∏¥‘”∂»O(n)
 */
public class MaximumSubArray {
	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}
	public static int maxSubArray(int[] nums) {
		int n = nums.length;
		if(n<0)
			return 0;
		if(n==1)
			return nums[0];
	    int sum = nums[0],count =nums[0];
		for(int i=1;i<n;i++) {
			count+=nums[i];
			if(count<=nums[i]) {
				count = nums[i];
			}
			if(count>sum) {
				sum=count;
			}
		}
	    return sum; 
	}
	public static int maxSubArray1(int[] nums) {
		return 0;
	}
}
