package cn.shgx.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
 * return its level order traversal as:
 [
   [3],
   [9,20],
   [15,7]
 ]
 */
public class BinaryTreeLevelOrderTraversalI {
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if(root==null) {
        	return resultList;
        }
        List<Integer> levelStorage = new LinkedList<Integer>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        queue.offer(null);
        while(queue.size()>1) {
        	TreeNode top = queue.poll();
        	if(top==null) {
        		resultList.add(levelStorage);
        		queue.offer(null);
        		levelStorage = new LinkedList<Integer>();
        	}else {
        		levelStorage.add(top.val);
        		if(top.left!=null) {
        			queue.offer(top.left);
        		}
        		if(top.right!=null) {
        			queue.offer(top.right);
        		}
        	}
        }
        resultList.add(levelStorage);
        return resultList;
    }
}
