package cn.shgx.easy;
/**
 *Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 *According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T 
 *that has both v and w as descendants (where we allow a node to be a descendant of itself).”
 */
public class LowestCommonAncestorofaBinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null || p== null|| q==null) return null;  
        if(Math.max(p.val, q.val) < root.val) {  
            return lowestCommonAncestor(root.left, p, q);  
        } else if(Math.min(p.val, q.val) > root.val) {  
            return lowestCommonAncestor(root.right, p, q);  
        } else return root;
    }
}
