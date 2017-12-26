package cn.shgx.easy;
/**
 * Given a non-empty array of integers, return the third maximum number in this array. 
 * If it does not exist, return the maximum number. 
 * The time complexity must be in O(n).
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
       double first = Double.NEGATIVE_INFINITY; 
       double second =  Double.NEGATIVE_INFINITY;
       double third = Double.NEGATIVE_INFINITY;
       for(int i=0;i<nums.length;i++) {
    	   if(nums[i]>first) {
    		   third = second;
    		   second = first;
    		   first = nums[i];
    	   }else if(nums[i]>second && nums[i]<first){
    		   third = second;
    		   second = nums[i];
    	   }else if(nums[i]>third && nums[i]<second){
    		   third = nums[i];
    	   }
       }
       return (int) ((third==second||third==Double.NEGATIVE_INFINITY)?first:third);
    }
}
