class BinaryTreeBalanced
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

    public boolean balanced(Node node)
    {
        return height(node) != -1;
    }

    private int height(Node node)
    {
        if (node == null) 
        	return 0;

        int leftHeight = height(node.left);
        if (leftHeight == -1) 
        	return -1;

        int rightHeight = height(node.right);
        if (rightHeight == -1) 
        	return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) 
        {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BinaryTreeBalanced tree = new BinaryTreeBalanced();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        System.out.println("Balanced Tree: " + tree.balanced(tree.root));

        BinaryTreeBalanced skewed = new BinaryTreeBalanced();
        skewed.root = new Node(1);
        skewed.root.right = new Node(2);
        skewed.root.right.right = new Node(3);
        skewed.root.right.right.right = new Node(4);
        System.out.println("Skewed Tree: " + skewed.balanced(skewed.root));
    }
}
