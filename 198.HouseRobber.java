package cn.shgx.easy;
/**
 *You are a professional robber planning to rob houses along a street. 
 *Each house has a certain amount of money stashed, 
 *the only constraint stopping you from robbing each of them is that adjacent houses have security system connected 
 *and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *Given a list of non-negative integers representing the amount of money of each house, determine 
 *the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber {
	public int rob(int[] nums) {
		if(nums==null||nums.length==0) {
			return 0;
		}
		int t0 = 0;
		int t1 = 0;
		for(int i=0;i<nums.length;i++) {
			int temp = t0;
			t0 = Math.max(t0, t1);
			t1 = temp+nums[i];
		}
		return t0>t1?t0:t1;
	}
}
