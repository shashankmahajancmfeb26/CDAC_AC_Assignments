class InorderPreorderPostorder {
	public static class Node {
	    int data;
	    Node left, right;

	    public Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	Node root;

    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
    	InorderPreorderPostorder tree = new InorderPreorderPostorder();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);
        
        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);
        
        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);
    }
}
