package cn.shgx.easy;
/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 */
public class RangeSumQueryImmutable {
	 int numArray[]; 
	 public RangeSumQueryImmutable(int[] nums) {
		 numArray = new int[nums.length];    
         numArray = nums.clone();  
	 }	    
	 public int sumRange(int i, int j) {
	     int sum = 0;
	     for(int k=i;k<=j;k++) {
	    	 sum+=numArray[k];
	     }
	     return sum;
	 }
	 /**
	  * Your NumArray object will be instantiated and called as such:
	  * NumArray obj = new NumArray(nums);
	  * int param_1 = obj.sumRange(i,j);
	  */
	 //方法二：
	 private int sum[];
	 /*public RangeSumQueryImmutable(int[] nums) {
		 sum = new int[nums.length+1]; 
		 for(int i=0;i<nums.length;i++){
		     sum[i+1] = sum[i]+nums[i];
		 }
	 }*/	    
	 public int sumRange1(int i, int j) {
	     return sum[j+1]-sum[i];
	 }
}
