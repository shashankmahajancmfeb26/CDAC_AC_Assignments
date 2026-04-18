class SortedArrayToBalancedBST 
{
	public static class Node 
	{
	    int data;
	    Node left, right;
	    public Node(int d) 
	    {
	        data = d;
	        left = right = null;
	    }
	}
	Node root;

    Node sortedArray(int[] arr, int start, int end)
    {
        if (start > end)
        {
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        node.left = sortedArray(arr, start, mid - 1);

        node.right = sortedArray(arr, mid + 1, end);

        return node;
    }

    void preorder(Node node)
    {
        if (node == null) 
        	return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
    	SortedArrayToBalancedBST tree = new SortedArrayToBalancedBST();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        tree.root = tree.sortedArray(arr, 0, arr.length - 1);

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);        
    }
}
