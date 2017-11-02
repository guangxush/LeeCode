package cn.shgx.easy;
/**
 *Rotate an array of n elements to the right by k steps.
 *For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class RotateArray {
	public static void main(String[] args) {
		rotate3(new int[]{1,2,3,4,5,6,7}, 3);
		//rotate(new int[]{1}, 2);
		//rotate(new int[]{1,2}, -1);
		//rotate(new int[]{1,2}, 1);
		//rotate(new int[]{1,2,3}, 1);
	}
	//T=O(n*k),S=O(1)
    public static void rotate(int[] nums, int k) {
        int temp,previous;
        for(int i = 0;i<k;i++) {
        	previous = nums[nums.length-1];
        	for(int j=0;j<nums.length;j++) {
        		temp = nums[j];
        		nums[j] = previous;
        		previous = temp;
        	}
        }
        for(int i=0;i<nums.length;i++) {
        	System.out.println(nums[i]);
        }
    }
    //T(n)=O(n),S(n)=O(n)
    public static void rotate1(int[] nums,int k) {
    	int[] a = new int[nums.length];
    	for(int i=0;i<nums.length;i++) {
    		a[(i+k)%nums.length] = nums[i];
    	}
    	for(int i=0;i<nums.length;i++) {
    		nums[i] = a[i];
    	}
    }
    //T(n)=O(n),S(n)=1
    public static void rotate2(int[] nums,int k) {
    	k = k%nums.length;
    	int count = 0;
    	for(int start = 0;count<nums.length;start++) {
    		int current = start;
    		int prev = nums[start];
    		do {
    			int next = (current+k)%nums.length;
    			int temp = nums[next];
    			nums[next] = prev;
    			prev = temp;
    			current = next;
    			count++;
    		}while(start!=current);
    	}
    }
    //T(n)=O(n),S(n)=1
    public static void rotate3(int[] nums,int k) {
    	k = k%nums.length;
    	reverse(nums, 0, nums.length-1);
    	reverse(nums, 0, k-1);
    	reverse(nums, k, nums.length-1);
    	
    }
    public static void reverse(int[] nums,int start,int end) {
    	while(start<end) {
    		int temp = nums[start];
    		nums[start] = nums[end];
    		nums[end] = temp;
    		start++;
    		end--;
    	}
    }
}
