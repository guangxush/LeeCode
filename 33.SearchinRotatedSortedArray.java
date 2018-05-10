package cn.shgx.medium;
/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 */
public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
    	if(nums.length==0) return -1;
        int left =0,right =nums.length-1;
        int mid = left+(right-left)/2;
        while(left<=right) {
        	if(nums[mid]==target) return mid;
        	if(nums[left]<=nums[mid]) {
        		if(target<nums[mid]&&target>=nums[left]) {
        			right=mid-1;
        		}else {
        			left=mid+1;
        		}
        	}
        	if(nums[mid]<=nums[right]) {
        		if(target>nums[mid]&&target<=nums[right]) {
        			left=mid+1;
        		}else {
        			right=mid-1;
        		}
        	}
        	mid = left+(right-left)/2;
        }
        return -1;
    }
}
/**
 * 本题是将一个排好序的数组从某一个（不清楚为什么原题中是some pivot，
 * 但是肯定是一个，因为如果是多个，考虑极端情况数组将会变成完全是无序的）位置进行旋转，
 * 也就是说将一个本来严格递增的数组变成了前后两部分递增的序列，所以会有一个分界。在这样一个旋转后的数组里面查找数字，
 * 并返回它的下标，如果找不到的话返回-1。
 */