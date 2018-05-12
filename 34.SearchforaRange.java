package cn.shgx.medium;
/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class SearchforaRange {
	//二分查找法
    public int[] searchRange1(int[] nums, int target) {
    	if(nums==null||nums.length==0) return new int[]{-1,-1};
        int n = nums.length;
        int[] res = {-1,-1};
        int start = 0,end= n-1;
        while(nums[start]<nums[end]) {
        	int mid = start+(end-start)/2;
        	if(nums[mid]>target) end = mid-1;
        	else if(nums[mid]<target) start=mid+1;
        	else {
        		if(nums[start]<target) start++;
        		if(nums[end]>target) end--;
        	}
        }
        if(nums[start]==target) {
        	res[0] = start;
        	res[1] = end;
        }
        return res;
    }
}
