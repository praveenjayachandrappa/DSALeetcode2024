package tree;// program for iterative post-order traversal

import java.util.*;

// node class for a binary tree
class Node {
	int data;
	Node left, right;

	Node(int item)
	{
		data = item;
		left = right;
	}
}

class BinaryTree {
	Node root;
	ArrayList<Integer> postOrderTraversalNodesList = new ArrayList<Integer>();

	// function to do post-order traversal
	ArrayList<Integer> postOrderTraversal(Node node) {
		Stack<Node> stack1 = new Stack<Node>();

		// empty tree check
		if (node == null)
			return postOrderTraversalNodesList;
		stack1.push(node);
		Node prev = null;
		while (!stack1.isEmpty()) {
			Node current = stack1.peek();
			if (prev == null || prev.left == current || prev.right == current) {
				if (current.left != null)
					stack1.push(current.left);
				else if (current.right != null)
					stack1.push(current.right);
				else {
					stack1.pop();
					postOrderTraversalNodesList.add(current.data);
				}
			} else if (current.left == prev) {
				if (current.right != null)
					stack1.push(current.right);
				else {
					stack1.pop();
					postOrderTraversalNodesList.add(current.data);
				}
			} else if (current.right == prev) {
				stack1.pop();
				postOrderTraversalNodesList.add(current.data);
			}

			prev = current;
		}

		return postOrderTraversalNodesList;
	}


	public List<List<Integer>> levelOrderTraversal(Node root) {

		List<List<Integer>> res = new ArrayList<>();

		if (root == null) return res;

		Queue<Node> q = new LinkedList<>();

		q.add(root);

		while (!q.isEmpty()) {

			int size = q.size();
			List<Integer> temp = new ArrayList<>();
			while (size-- > 0) {
				Node t = q.poll();
				if (t.left != null)
					q.add(t.left);
				if (t.right != null)
					q.add(t.right);

				temp.add(t.data);
			}

			res.add(temp);
		}

		return res;
	}

	public int countNodes(Node root){

		if(root==null) return 0;

		return 1+countNodes(root.left) +countNodes(root.right);
	}

	public int height(Node root){

		if(root==null) return -1;

		int x=height(root.left);

		int y=height(root.right);

		return Math.max(x,y)+1;
	}

	public int countLeafNodes(Node root){

		if(root==null) return 0;

		if(root.left==null && root.right==null)
			return 1+countLeafNodes(root.left)+countLeafNodes(root.right);
		else
			return countLeafNodes(root.left) + countLeafNodes(root.right);
	}

	public int countNodesWithDegreeTwo(Node root){

		if(root==null) return 0;

		if(root.left!=null && root.right!=null)
			return 1+countNodesWithDegreeTwo(root.left) + countNodesWithDegreeTwo(root.right);

		return countNodesWithDegreeTwo(root.left) +countNodesWithDegreeTwo(root.right);
	}

	public int countNodesWithDegreeOne(Node root){

		if(root==null) return 0;

		if( (root.left!=null && root.right==null) || (root.left==null && root.right!=null)){

			return 1+countNodesWithDegreeOne(root.left) + countNodesWithDegreeOne(root.right);
		}
		else{

			return countNodesWithDegreeOne(root.left) + countNodesWithDegreeOne(root.right);
		}
	}
}
class Main{
    // main function to run the program
	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();

		// Let us create trees shown in above diagram
		tree.root = new Node(3);
		tree.root.left = new Node(4);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(8);
		tree.root.left.right=new Node(10);
		tree.root.right.left=new Node(11);
		tree.root.right.right=new Node(13);


//		System.out.println(	tree.countNodes(tree.root));
//
//		System.out.println(tree.height(tree.root));

		//System.out.println(tree.countLeafNodes(tree.root));

		//System.out.println(tree.countNodesWithDegreeTwo(tree.root));
////
////		List<List<Integer>> lists = tree.levelOrderTraversal(tree.root);
////
////		lists.stream().forEach(list -> System.out.println(list));
////
////		ArrayList<Integer> resultantList = tree.postOrderTraversal(tree.root);
////
////		System.out.print(
////			"Post order traversal :");
////		System.out.println(resultantList);
//
//
//		tree.root = new Node(3);
//		tree.root.left = new Node(4);
//		tree.root.right = new Node(5);
//		tree.root.left.right=new Node(10);
//		tree.root.right.right=new Node(13);
//		System.out.println(tree.countNodesWithDegreeOne(tree.root));
	}
}

