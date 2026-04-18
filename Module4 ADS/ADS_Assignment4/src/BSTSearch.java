class BSTSearch
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

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null) 
        	return false;
        
        if (root.key == key) 
        	return true;

        if (key > root.key) 
        	return searchRec(root.right, key);

        return searchRec(root.left, key);
    }

    public static void main(String[] args) {
    	BSTSearch tree = new BSTSearch();
        int[] nodes = {50, 30, 20, 40, 70, 60, 80};
        for (int value : nodes) tree.insert(value);

        System.out.print("Search for 40: ");
        if(tree.search(40))
        	System.out.println("Found");
        else
        	System.out.println("Not Found");
        
        System.out.print("Search for 90: ");
        if(tree.search(90))
        	System.out.println("Found");
        else
        	System.out.println("Not Found");	
    }
}
