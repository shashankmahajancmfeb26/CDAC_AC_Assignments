class BSTInsert 
{
	public static class Node 
	{
	    int key;
	    Node left, right;
	    public Node(int item) 
	    { 
	    	key = item; 
	    	left = right = null; 
	    }
	}
	Node root;
    
	void insert(int key) 
	{ 
		root = insertRecursive(root, key); 
	}
	
    Node insertRecursive(Node root, int key) 
    {
        if (root == null) 
        	return new Node(key);
        if (key < root.key) 
        	root.left = insertRecursive(root.left, key);
        else if (key > root.key) 
        	root.right = insertRecursive(root.right, key);
        return root;
    }
    
    void inorder()
    { 
    	inorderRecursive(root);
    }
    
    void inorderRecursive(Node root) {
        if (root != null) {
        	inorderRecursive(root.left);
            System.out.print(root.key + " ");
            inorderRecursive(root.right);
        }
    }
    
    public static void main(String[] args) 
    {
    	BSTInsert tree = new BSTInsert();
        int[] nodes = {50, 30, 20, 40, 70, 60, 80};
        for (int i : nodes) 
        	tree.insert(i);
        System.out.print("Inorder Traversal: ");
        tree.inorder();
    }
}
