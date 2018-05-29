package cn.shgx.medium;

import java.util.HashMap;

/**
Given inorder and postorder traversal of a tree, construct the binary tree.
Note:
You may assume that duplicates do not exist in the tree.
For example, given
inorder = [9,3,15,20,7]
postorder = [9,15,7,20,3]
Return the following binary tree:
    3
   / \
  9  20
    /  \
   15   7
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal {
	 public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0 || postorder == null || postorder.length == 0 || inorder.length != postorder.length)
            return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i ++)
            map.put(inorder[i], i);
        return helper(inorder, 0, inorder.length - 1, postorder, postorder.length - 1, map);
    }
    TreeNode helper(int[] inorder, int startIn, int endIn, int[] postorder, int endPost, HashMap<Integer, Integer> map) {
        if(startIn > endIn)
            return null;
        TreeNode root = new TreeNode(postorder[endPost]);
        int index = map.get(root.val);
        root.right = helper(inorder, index + 1, endIn, postorder, endPost - 1, map);
        root.left = helper(inorder, startIn, index - 1, postorder, endPost - (endIn - index + 1), map);
        return root;
    }
}
