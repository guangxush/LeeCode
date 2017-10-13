package cn.shgx.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *Given nums = [2, 7, 11, 15], target = 9,
 *Because nums[0] + nums[1] = 2 + 7 = 9,
 *return [0, 1].
 */

public class TwoSum {
	public int[] twoSum(int[] nums,int target) {
		int[] result = new int[2];
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					result[0]=i;
					result[1]=j;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] result = Solution2.twoSum(new int[] {3,2,4},6);
	    System.out.println(result[0]);
	    System.out.println(result[1]);
	}
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
       }
       for(int i=0;i<nums.length;i++){
           int num1 = target-nums[i];
           if(map.containsKey(num1)&&map.get(num1)!=i){
               return new int[] {i,map.get(num1)};
           }
       }
       throw new IllegalArgumentException("No two sum solution");
    }
}
class Solution2{
	public static int[] twoSum(int[] nums,int target) {
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], i);
			int num1=target-nums[i];
			if(map.containsKey(num1)&&map.get(num1)!=i) {
				return new int[] {map.get(num1),i};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
