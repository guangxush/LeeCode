package cn.shgx.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class IntersectionofTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
          Arrays.sort(nums1);
          Arrays.sort(nums2);
          ArrayList<Integer> result = new ArrayList<Integer>();
          int mark = 0;
          for(int i=0,j=0;i<nums1.length&&j<nums2.length;) {
        	  if(nums1[i]==nums2[j]) {
        		  if(result.size()==0||nums1[i]!=mark) {
        			  result.add(nums1[i]);
        			  mark = nums1[i];
        		  }
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
        	  res[i]=(int)result.get(i);
          }
          return res;
    }
	public int[] intersection1(int[] nums1, int[] nums2) {
		 Set<Integer> set = new HashSet<>();
		 Set<Integer> result = new HashSet<>();
		 for(int i=0;i<nums1.length;i++) {
			 set.add(nums1[i]);
		 }
		 for(int j=0;j<nums2.length;j++) {
			 if(set.contains(nums2[j])) {
				 result.add(nums2[j]);
			 }
		 }
		 int[] res = new int[result.size()];
		 int k = 0;
		 for(Integer num :result) {
			 res[k++] = num;
		 }
		 return res;
	}
}
