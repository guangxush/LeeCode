package cn.shgx.easy;
/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {
	public int singleNumber(int[] nums) {
        //异或运算两者相同则结果为 0，不同则结果为 1,满足交换律，所以可以默认相同的元素挨着
		int result = 0;
		for(int i=0;i<nums.length;i++) {
			result ^= nums[i];
		}
		return result;
    }
}
