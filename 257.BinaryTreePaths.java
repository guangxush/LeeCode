package cn.shgx.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 *Given a binary tree, return all root-to-leaf paths.
 *For example, given the following binary tree:
 *
   1
 /   \
2     3
 \
  5
 *All root-to-leaf paths are:
 *["1->2->5", "1->3"]
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePaths {
	public List<String> resultList = new ArrayList<String>();
	//深度优先搜索
	public List<String> binaryTreePaths(TreeNode root) {
        if(root ==null) {
        	return resultList;
        }
        findPaths(root,root.val+"");
        return resultList;
    }
	private void findPaths(TreeNode node,String path) {
		if(node.left==null&&node.right==null) {
			resultList.add(path);
		}
		if(node.left!=null) {
			findPaths(node.left, path+"->"+node.left.val);
		}
		if(node.right!=null) {
			findPaths(node.right, path+"->"+node.right.val);
		}
	}
	
	//广度优先搜索
	public List<String> binaryTreePaths1(TreeNode root) {
        if(root ==null) {
        	return resultList;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        Queue<String> pathQueue = new LinkedList<>();
        nodeQueue.offer(root);
        pathQueue.offer(root.val+"");
        while(!nodeQueue.isEmpty()) {
        	TreeNode currNode = nodeQueue.poll();
        	String item = pathQueue.poll();
        	if(currNode.left==null&&currNode.right==null) {
        		resultList.add(item);
        	}
        	if(currNode.left!=null) {
        		nodeQueue.offer(currNode.left);
        		pathQueue.offer(item+"->"+currNode.left.val);
        	}
        	if(currNode.right!=null) {
        		nodeQueue.offer(currNode.right);
        		pathQueue.offer(item+"->"+currNode.right.val);
        	}
        }
        return resultList;
    }
	//递归
	public List<String> binaryTreePaths2(TreeNode root) {
		List<String> pathsList = new ArrayList<String>();
		if(root==null) {
			return pathsList;
		}
		if(root.left==null&&root.right==null) {
			pathsList.add(root.val+"");
			return pathsList;
		}
		for(String path:binaryTreePaths2(root.left)) {
			pathsList.add(root.val+"->"+path);
		}
		for(String path:binaryTreePaths2(root.right)) {
			pathsList.add(root.val+"->"+path);
		}
		return pathsList;
	}
}
