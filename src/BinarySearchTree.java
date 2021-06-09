

public class BinarySearchTree {


	Node root;

	public BinarySearchTree createBinaryTree() {
		
	    BinarySearchTree bt = new BinarySearchTree();

		bt.add(193);
		bt.add(215);
		bt.add(333);
		bt.add(9);
		bt.add(73);
		bt.add(180);
	
		return bt;
	}

	public void add(int value) {
		root = addRecursive(root, value);
	}



	public Node addRecursive(Node current, int value){

		if(current == null)
			return new Node(value);
		else if(value > current.value)
			current.right = addRecursive(current.right, value);
		else if(value < current.value)
			current.left = addRecursive(current.left, value);

		return current;
	}

	// In order traversal
	// Visit left node
	// Print value of the root
	// Visit right node

	public void printNodes(Node current) {
			
		
		if(current == null){
			return;
		}

		printNodes(current.left); // Keeps going to the left most node -- deeper and deepest
		System.out.println(current.value); // Print as soon as the next one gives null (base case - recursion reaches a sort of breakthrough)
		printNodes(current.right); // Next do the same with right nodes (right subtree) -- mind that the subtree starts from deepest (i.e after deepest left node is found and printed)

	}
}

