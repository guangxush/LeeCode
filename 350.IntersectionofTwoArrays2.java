package cn.shgx.easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class IntersectionofTwoArrays2 {
	 public int[] intersect(int[] nums1, int[] nums2) {
		 Arrays.sort(nums1);
         Arrays.sort(nums2);
         ArrayList<Integer> result = new ArrayList<Integer>();
         for(int i=0,j=0;i<nums1.length&&j<nums2.length;) {
        	 if(nums1[i]==nums2[j]) {
        		 result.add(nums1[i]);
        		 i++;
        		 j++;
        	 }else if(nums1[i]<nums2[j]) {
        		 i++;
        	 }else {
        		 j++;
        	 }
         }
         int[] res = new int[result.size()];
         for(int i=0;i<res.length;i++) {
        	 res[i]=result.get(i);
         }
         return res;
	 }
}
