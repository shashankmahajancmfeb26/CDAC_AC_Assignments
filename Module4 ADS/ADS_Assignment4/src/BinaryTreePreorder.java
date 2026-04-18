

class BinaryTreePreorder 
{
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
        if (node == null)
            return;

        System.out.print(node.data + " ");

        preorder(node.left);

        preorder(node.right);
    }
    
    public static void main(String[] args) {
        BinaryTreePreorder tree = new BinaryTreePreorder();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Preorder: ");
        tree.preorder(tree.root);
    }
}
