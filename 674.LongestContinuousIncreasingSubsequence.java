package cn.shgx.easy;
/**
 *Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).
 *Example 1:
 *Input: [1,3,5,4,7]
 *Output: 3
 *Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
 *Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 
 *Example 2:
 *Input: [2,2,2,2,2]
 *Output: 1
 *Explanation: The longest continuous increasing subsequence is [2], its length is 1. 
 *Note: Length of the array will not exceed 10,000.
 */
public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int res = 0, cnt = 0;
        for(int i=0;i<nums.length;i++) {
        	if(i==0||nums[i-1]<nums[i]) res=Math.max(res, ++cnt);
        	else cnt = 1;
        }
        return res;
    }
    public int findLengthOfLCIS1(int[] nums) {
        if(nums.length==0 || nums==null) return 0;
        int[] dp = new int[nums.length];
        int max = 1,n = nums.length;
        dp[0] = 1;
        for(int i=1;i<n;i++) {
        	if(nums[i]>nums[i-1]) {
        		dp[i] = dp[i-1]+1;
        	}else {
        		dp[i]=1;
        	}
        	max = Math.max(max, dp[i]);
        }
        return max;
    }
}
