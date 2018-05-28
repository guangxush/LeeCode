package cn.shgx.easy;
/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * But the following [1,2,2,null,3,null,3] is not:
 */
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){val = x;}
}
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if(root==null) {
			return true;
		}
        return checkNodes(root.left, root.right);
    }
	public boolean checkNodes(TreeNode left,TreeNode right) {
		if(left==null&&right==null)
			return true;
		if(left==null||right==null)
			return false;
		if(left.val!=right.val){
			return false;
		}else {
			return checkNodes(left.left,right.right)&&checkNodes(left.right, right.left);
		}
	}
}
