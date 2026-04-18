class BSTMinMax 
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

    public int min() 
    {
        if (root == null) throw new IllegalStateException("Tree is empty");
        Node current = root;
        while (current.left != null) 
        {
            current = current.left;
        }
        return current.key;
    }

    public int max() {
        if (root == null) throw new IllegalStateException("Tree is empty");
        Node current = root;
        while (current.right != null) 
        {
            current = current.right;
        }
        return current.key;
    }

    public static void main(String[] args) 
    {
    	BSTMinMax tree = new BSTMinMax();
        int[] nodes = {50, 30, 20, 40, 70, 60, 80};
        for (int value : nodes)
        	tree.insert(value);

        System.out.println("Min: " + tree.min());
        System.out.println("Max: " + tree.max());
    }
}
