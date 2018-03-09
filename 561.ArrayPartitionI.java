package cn.shgx.easy;
/**
 *Given an array of 2n integers, your task is to group these integers into n pairs of integer, 
 *say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *Example 1:
 *Input: [1,4,3,2]
 *Output: 4
 *Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 *Note:
 *n is a positive integer, which is in the range of [1, 10000].
 *All the integers in the array will be in the range of [-10000, 10000].
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        quickSort(nums, 0, nums.length-1);
        for(int i=0;i<nums.length;i+=2) {
        	sum+=nums[i];
        }
        return sum;
    }
    private void quickSort(int[] src,int begin, int end) {
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
    				src[j] = src[i];
    				src[i] = key;
    				j--;
    			}
    		}
    		quickSort(src, begin, i-1);
    		quickSort(src, i+1, end);
    	}
    }
}
