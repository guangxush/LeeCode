package cn.shgx.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * [
  [15,7],
  [9,20],
  [3]
   ]
 */
/*class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){val = x;}
}*/
public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) {
        	return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()) {
        	int num = queue.size();
        	List<Integer> levelList = new LinkedList<Integer>();
        	for(int i=0;i<num;i++) {
        		if(queue.peek().left!=null) {
        			queue.offer(queue.peek().left);
        		}
        		if(queue.peek().right!=null) {
        			queue.offer(queue.peek().right);
        		}
        		levelList.add(queue.poll().val);
        	}
        	list.add(0,levelList);
        }
        return list;
    }
}
