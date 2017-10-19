package cn.shgx.easy;
/**
 *Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
 *Note:
 *Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNum2 {
	 public int singleNumber(int[] nums) {
	     int result = 0;
	     for(int i=0;i<32;i++) {
	    	 int sum = 0;
	    	 for(int j=0;j<nums.length;j++) {
	    		 sum+=(nums[j]>>i)&1;
	    	 }
	    	 result|=(sum%3)<<i;
	     }
	     return result;
	 }
}
