class LevelOrderTraversal 
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

    int getHeight(Node root) 
    {
        if (root == null) return 0;
        int lHeight = getHeight(root.left);
        int rHeight = getHeight(root.right);
        return Math.max(lHeight, rHeight) + 1;
    }

    void displayCurrentLevel(Node root, int level) 
    {
        if (root == null) return;
        if (level == 1) 
        {
            System.out.print(root.data + " ");
        } else if (level > 1) 
        {
        	displayCurrentLevel(root.left, level - 1);
        	displayCurrentLevel(root.right, level - 1);
        }
    }

    void levelOrder() {
        int h = getHeight(root);
        for (int i = 1; i <= h; i++) 
        {
        	displayCurrentLevel(root, i);
        }
    }

    public static void main(String args[]) 
    {
        LevelOrderTraversal tree = new LevelOrderTraversal();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.levelOrder();
    }
}
