package cn.shgx.easy;
/*
Given a sorted array, remove the duplicates in place such that
 each element appear only once and return the new length.
Do not allocate extra space for another array, 
you must do this in place with constant memory.
For example,
Given input array nums = [1,1,2],
Your function should return length = 2, with the first two elements 
of nums being 1 and 2 respectively. It doesn't matter what you leave 
beyond the new length.
 */
public class RemoveDuplicatesfromSortedArray {
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] {1,1,2,2,2,2,3,3,4,5,6}));
	}
	public static int removeDuplicates(int[] nums) {
		int count = 1;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i+1]!=nums[i]) {
				nums[count]=nums[i+1];
				count++;
			}
		}
		for(int i=count;i<nums.length;i++) {
			nums[i]=0;
		}
		System.out.println(nums.length);
		return count;
	}

}
