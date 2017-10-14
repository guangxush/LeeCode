package cn.shgx.easy;
/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree 
 * in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
	    if(root==null)
	    	return true;
	    int left = depth(root.left);
	    int right = depth(root.right);
	    if(left-right>1||right-left>1) {
	    	return false;
	    }else{
	    	return isBalanced(root.left)&&isBalanced(root.right);
	    }
	}
	/**
	 * 递归求解树的深度
	 * @param node
	 * @return
	 */
	public int depth(TreeNode node) {
		if(node==null) {
			return 0;
		}
		if(node.left==null&&node.right==null) {
			return 1;
		}else {
			int left = depth(node.left);
			int right = depth(node.right);
			return left>right?left+1:right+1;
		}
	}
}
