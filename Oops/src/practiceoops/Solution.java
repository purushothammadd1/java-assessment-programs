package practiceoops;

public class Solution {



	public static Node findTargetNode(Node root, int target) {
		if (root == null || root.data == target) {
			return root;
		} else if (root.data < target) {
			return findTargetNode(root.right, target);
		} else {
			return findTargetNode(root.left, target);
		}
	}

	public static int sumToNode(Node root, Node node) {
		if (root == null) {
			return 0;
		} else if (root == node) {
			return root.data;
		} else if (root.data < node.data) {
			return root.data + sumToNode(root.right, node);
		} else {
			return root.data + sumToNode(root.left, node);
		}
	}

	public static int sumToChildLeaf(Node node) {
		if (node == null) {
			return 0;
		} else if (node.left == null && node.right == null) {
			return 0;
		} else if (node.left == null) {
			return node.right.data + sumToChildLeaf(node.right);
		} else if (node.right == null) {
			return node.left.data + sumToChildLeaf(node.left);
		} else {
			return Math.max(node.left.data, node.right.data) + sumToChildLeaf(node.left) + sumToChildLeaf(node.right);
		}
	}

	public static int maxDifferenceBST(Node root, int target) {
		Node targetNode = findTargetNode(root, target);
		if (targetNode == null) {
			return -1;
		}
		int sumToTarget = sumToNode(root, targetNode);
		int sumToLeaf = sumToChildLeaf(targetNode);
		return Math.abs(sumToTarget - sumToLeaf);
	}

}
