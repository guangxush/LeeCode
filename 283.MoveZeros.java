package cn.shgx.easy;
/**
 *Given an array nums, write a function to move all 0's to 
 *the end of it while maintaining the relative order of the non-zero elements.
 *For example, given nums = [0, 1, 0, 3, 12], after calling your function,
 *nums should be [1, 3, 12, 0, 0].
 *Note:
 *You must do this in-place without making a copy of the array.
 *Minimize the total number of operations.
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        for(int i=0,j=0;i<nums.length;i++) {
        	if(nums[i]!=0){//i代表当前元素的偏移标记
        		if(i!=j) {
        			nums[j]=nums[i];
        			nums[i]=0;
        		}
        		j++;//下一个不等于0的元素
        	}
        }
    }
    public void moveZeroes1(int[] nums) {
        int i =0;
        int count = 0;
        for(i=0;i<nums.length;i++) {
        	if(nums[i]!=0) {
        		nums[count++] = nums[i];
        	}
        }
        while(count<nums.length) {
        	nums[count++]=0;
        }
    }
}
