package cn.shgx.easy;
/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical 
 * and the nodes have the same value.
 */
public class SameTree {
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean leftsame = true;
        boolean rightsame = true;
        if(p==null&&q==null) {
        	return true;
        }else if((p==null&&q!=null)||(q==null&&p!=null)) {
        	return false;
        }else if(p.val!=q.val)
        	return false;
        leftsame = isSameTree(p.left, q.left);
        rightsame = isSameTree(p.right, q.right);
        return leftsame&&rightsame;
    }
}
