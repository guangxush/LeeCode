package cn.shgx.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {
	//排序之后中间的元素即为最大元素
	public int majorityElement(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums[(nums.length-1)/2];
    }
	//扫描一遍数组用map存放次数，找出次数大于size/2的数
    public int majorityElement2(int[] nums) {
	    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	    for(int i=0;i<nums.length;i++) {
	    	if(map.get(nums[i])!=null) {
	    		map.put(nums[i], (int)map.get(nums[i])+1);
	    	}else {
	    		map.put(nums[i], 0);
	    	}
	    }
	    for(Integer value:map.values()) {
	    	if(value>=(nums.length/2))
	    		return map.get(value);
	    }
	   throw new IllegalArgumentException();
    }
	public void quickSort(int[] src,int begin,int end) {
		if(begin<end) {
			int key = src[begin];
			int i = begin;
			int j = end;
			while(i<j) {
				while(i<j&&src[j]>key) {
					j--;
				}
				if(i<j) {
					src[i]=src[j];
					src[j]=key;
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
			quickSort(src, begin, i-1);
			quickSort(src, i+1, end);
		}
	}
}
