package cn.shgx.easy;
/**
 * Given a sorted array and a target value, 
 * return the index if the target is found. If not, 
 * return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
   Here are few examples.
   [1,3,5,6], 5 �� 2
   [1,3,5,6], 2 �� 1
   [1,3,5,6], 7 �� 4
   [1,3,5,6], 0 �� 0
    ʱ�临�Ӷ�O(logn)
 */
public class SearchInsertPosition {
	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] {1,3,5,6},5));
		System.out.println(searchInsert(new int[] {1,3,5,6},2));
		System.out.println(searchInsert(new int[] {1,3,5,6},7));
		System.out.println(searchInsert(new int[] {1,3,5,6},0));
	}
    public static int searchInsert(int[] nums, int target) {
    	int left = 0;
    	int right = nums.length-1;
    	int middle = (left + right)/2;
    	while(left <= right) {
    		if(target==nums[middle]) {
    			return middle;
    		}
    		else if(target<nums[middle]) {
    			right  = middle-1;
    			middle = (left + right)/2;
    		}else if(target>nums[middle]) {
    			left = middle +1;
    			middle = (left + right)/2;
    		}
    	}
    	if(target<nums[middle]) {
    		return middle;
    	}else {
    		return middle+1;
    	}
    }
}
