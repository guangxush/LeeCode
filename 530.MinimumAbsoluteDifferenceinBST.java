package cn.shgx.easy;
/**
 *Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
 *Example:
 *Input:

   1
    \
     3
    /
   2

 *Output:
 *1
 *Explanation:
 *The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 *Note: There are at least two nodes in this BST.
 */
public class MinimumAbsoluteDifferenceinBST {
	int minDiff = Integer.MAX_VALUE;
	TreeNode prev;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    public void  inorder(TreeNode root) {
    	if(root==null) return;
    	inorder(root.left);
    	if(prev!=null)minDiff=Math.min(minDiff, root.val-prev.val);
    	prev = root;
    	inorder(root.right);
    }
}
