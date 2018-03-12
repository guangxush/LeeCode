package cn.shgx.easy;
/**
 *Given two non-empty binary trees s and t, check whether tree t has exactly
 * the same structure and node values with a subtree of s.
 * A subtree of s is a tree consists of a node in s and all of this node's descendants. 
 * The tree s could also be considered as a subtree of itself.
 *Example 1:
 *Given tree s:

     3
    / \
   4   5
  / \
 1   2
  *Given tree t:
   4 
  / \
 1   2
  *Return true, because t has the same structure and node values with a subtree of s.
  *Example 2:
  *Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
 *Given tree t:
   4
  / \
 1   2
 *Return false.
 */
public class SubtreeofAnotherTree {
	class Solution {
	    public boolean isSubtree(TreeNode s, TreeNode t) {
	        if(t==null) return true;
	        if(s==null) return false;
	        if(isSameTree(s, t)) {
	        	return true;
	        }
	        return isSubtree(s.left, t)||isSubtree(s.right, t);
	    }
	    private boolean isSameTree(TreeNode a, TreeNode b) {
	    	if(a==null&&b==null) return true;
	    	if(a==null||b==null) return false;
	    	if(a.val != b.val) return false;
	    	return isSameTree(a.left, b.left)&&isSameTree(a.right, b.right);
	    }
	}
}
