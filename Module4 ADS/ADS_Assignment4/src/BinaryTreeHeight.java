class BinaryTreeHeight 
{
	public static class Node 
	{
	    int data;
	    Node left, right;
	    public Node(int item)
	    { 
	    	data = item;
	    	left = right = null;
	    }
	}

	Node root;

    int findHeight(Node node) 
    {
        if (node == null) 
        {
            return 0;
        }

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) 
    {
        BinaryTreeHeight tree = new BinaryTreeHeight();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height: " + tree.findHeight(tree.root)); 
    }
}
