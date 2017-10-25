package cn.shgx.easy;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTML.Tag;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSum2 {
	public static void main(String[] args) {
		int[] numbers = {0,0,3,4};
		int target = 0;
		System.out.println(twoSum(numbers,target));
	}
	public static int[] twoSum(int[] numbers, int target) {
		if(numbers==null||numbers.length==0)return null;
		int i=0,j=numbers.length-1;
		while(i<j) {
			long sum = numbers[i]+numbers[j];
			if(sum<target) {
				++i;
			}else if(sum>target) {
				--j;
			}else {
				return new int[] {i+1,j+1};
			}
		}
		return null;
    }
}
