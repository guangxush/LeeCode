package cn.shgx.easy;
/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
/*class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){val = x;}
}*/
public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
        if(root==null) {
        	return 0;
        }else {
        	int l = maxDepth(root.left);
        	int r = maxDepth(root.right);
        	return l<r?r+1:l+1;
        }
    }
}
