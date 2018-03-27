package cn.shgx.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *Given a Binary Search Tree and a target number, return true if there exist two elements in the BST 
 *such that their sum is equal to the given target.
 *Example 1:
 *Input: 
    5
   / \
  3   6
 / \   \
2   4   7

* Target = 9
* Output: True
* Example 2:
* Input: 
    5
   / \
  3   6
 / \   \
2   4   7

 * Target = 28
 * Output: False
 */
public class TwoSumIVInputisaBST {
    public boolean findTarget(TreeNode root, int k) {
    	List<Integer> nums = new ArrayList<Integer>();
    	inorder(root, nums);
    	for(int i=0,j=nums.size()-1;i<j;) {
    		if(nums.get(i)+nums.get(j)==k) return true;
    		if(nums.get(i)+nums.get(j)<k)i++;
    		else j--;
    	}
    	return false;
        
    }
    public void inorder(TreeNode root, List<Integer> nums) {
    	if(root == null) return;
    	inorder(root.left, nums);
    	nums.add(root.val);
    	inorder(root.right, nums);
    }
}
