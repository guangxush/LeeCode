package cn.shgx.medium;
/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 * The replacement must be in-place and use only constant extra memory.
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int len=nums.length,i=len-1,j,temp;
        //采用倒序查找的方法，查找到第一个递减的数字，比如2321，第一个递减的数字是2
        while(i>0 && nums[i]<=nums[i-1])i--;
        //然后在将这个递减数字后边的比它大的最小的数字互换，2321就为3221，
        if(i>0) {
        	j=len-1;
        	while(nums[j]<=nums[i-1])j--;
        	temp = nums[j];
        	nums[j] = nums[i-1];
        	nums[i-1]=temp;
        }
        //然后将后边的数字升序排列，这样就是了3122，由于之前是升序排列的所以直接两两交换就是降序
        j=len-1;
        while(i<j) {
        	temp=nums[i];
        	nums[i]=nums[j];
        	nums[j]=temp;
        	i++;j--;
        }
    }
    public void nextPermutation1(int[] nums) {
        int pi = -1; 
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                pi = i - 1;
                for (int j = nums.length - 1; j > pi; j--) {
                    if (nums[j] > nums[pi]) {
                        swap(nums, pi, j);
                        break;
                    }
                }
                break;
            }
        }
        reverse(nums, pi + 1, nums.length - 1);
    }
    
    private static void reverse(int[] nums, int s, int e) {
        while (s < e) {
            swap(nums, s, e);
            s++;
            e--;
        }
    }
    
    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
