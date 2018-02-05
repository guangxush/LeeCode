package cn.shgx.easy;


/**
 *Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is 
 *changed to the original key plus sum of all keys greater than the original key in BST.
 *Example:
 *Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

 *Output: The root of a Greater Tree like this:
             18
            /   \
          20     13
 */
public class ConvertBSTtoGreaterTree {
	private int sum = 0;
	public void post(TreeNode current) {
		if(current!=null) {
			post(current.right);
			current.val+=sum;
			sum = current.val;
			post(current.left);
		}
	}
    public TreeNode convertBST(TreeNode root) {
        post(root);
        return root;
    }
}
