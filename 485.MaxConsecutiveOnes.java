package cn.shgx.easy;
/**
 *Given a binary array, find the maximum number of consecutive 1s in this array.
 *Example 1:
 *Input: [1,1,0,1,1,1]
 *Output: 3
 *Explanation: The first two digits or the last three digits are consecutive 1s.
 *The maximum number of consecutive 1s is 3.
 *Note:
 *The input array will only contain 0 and 1.
 *The length of input array is a positive integer and will not exceed 10,000
 */
public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		System.out.println(findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
		System.out.println(findMaxConsecutiveOnes(new int[] {0}));
		System.out.println(findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1}));
	}
    public static  int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,max = 0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==1) {
        		count++;
        	}else {
        		if(count>max)
        			max = count;
        		count = 0;
        	}
        }
        if(count>max) {
        	max = count ;
        }
        return max;
    }
    public static  int findMaxConsecutiveOnes1(int[] nums) {
        int res = 0,sum = 0;
        for(int i=0;i<nums.length;i++) {
        	sum=(sum+nums[i])*nums[i];
        	res = Math.max(res, sum);
        }
        return res;
    }
}
