package cn.shgx.easy;
/**
 *Given an integer array, find three numbers whose product is maximum and output the maximum product.
 *Example 1:
 *Input: [1,2,3]
 *Output: 6
 *Example 2:
 *Input: [1,2,3,4]
 *Output: 24
 *Note:
 *The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
 *Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 */
public class MaximumProductofThreeNumbers {
    public int maximumProduct(int[] nums) {
    	 int n = nums.length-1; 
    	 quickSort(nums,0,n);
    	 int a = nums[n]*nums[n-1]*nums[n-2];
    	 int b = nums[0]*nums[1]*nums[n];
    	 return a>b?a:b;
    }
    private void quickSort(int[] src, int begin, int end) {
    	if(begin<end) {
    		int i = begin;
    		int j = end;
    		int key = src[i];
    		while(i<j) {
    			while(i<j&&src[j]>key) j--;
    			if(i<j) {
        			src[i] = src[j];
        			src[j] = key;
        			i++;
        		}
    			while(i<j&&src[i]<key) i++;
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
