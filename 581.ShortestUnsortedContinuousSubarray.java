package cn.shgx.easy;
/**
 *Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order,
 *then the whole array will be sorted in ascending order, too.
 *You need to find the shortest such subarray and output its length.
 *Example 1:
 *Input: [2, 6, 4, 8, 10, 9, 15]
 *Output: 5
 *Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 *Note:
 *Then length of the input array is in range [1, 10,000].
 *The input array may contain duplicates, so ascending order here means <=.
 */
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
    	int n = nums.length;
        int[] temp = new int[nums.length];
        for(int i = 0;i<nums.length;i++) {
        	temp[i] = nums[i];
        }
        quicksort(nums, 0, nums.length-1);
        int start = 0;
        while(start<n&&nums[start]==temp[start]) start++;
        int end = n-1;
        while(start<end&&nums[end]==temp[end])end--;
        return end-start+1;
    }
    private void quicksort(int[] src,int begin,int end) {
    	if(begin<end) {
    		int key = src[begin];
    		int i = begin;
    		int j = end;
    		while(i<j) {
    			while(i<j&&src[j]>key) {
    				j--;
    			}
    			if(i<j) {
    				src[i] = src[j];
    				src[j] = key;
    				i++;
    			}
    			while(i<j&&src[i]<key) {
    				i++;
    			}
    			if(i<j) {
    				src[j]=src[i];
    				src[i]=key;
    				j--;
    			}
    		}
    		quicksort(src, begin, i-1);
    		quicksort(src, i+1, end);
    	}
    }
}
