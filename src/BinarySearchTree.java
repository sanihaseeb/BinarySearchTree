

public class BinarySearchTree {


    Node root;
    


    public static BinarySearchTree createBinaryTree() {
        BinarySearchTree bt = new BinarySearchTree();
    
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
    
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

public static void printNodes(Node current) {

  
   if(current == null){
       return;
   }

   printNodes(current.left); // Keeps going to the left most node -- deeper and deepest
   System.out.println(current.value); // Print as soon as the next one gives null (base case - recursion reaches a sort of breakthroguh)
   printNodes(current.right); // Next do the same with right nodes (right subtree) -- mind that the subtree starts from deepest (i.e after deepest left node is found and printed)

}
}
