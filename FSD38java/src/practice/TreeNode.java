package practice;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(){
		
	}
	TreeNode(int val, TreeNode left, TreeNode right) {
		super();
		this.val = val;
		this.left = left;
		this.right = right;
	}
	public boolean isSymetric(TreeNode root) {
		if(root == null)
		return true;
		return helper(root.left,root.right);
		
	}
	public boolean helper(TreeNode left, TreeNode right) {
		if(left == null && right == null) return true;
		if(left == null || right == null || left.val != right.val) return false;
		return helper(left.left,right.right) && helper(left.right, right.left);
	}

}
