public class LinkedListReverse {
	
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	static Node head;
	
	void insertAtEnd(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
	}
	
	static void display(Node head) {
        if (head == null) {
            System.out.println("(empty)");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		LinkedListReverse l1 = new LinkedListReverse();
		
		//Existing Linked List
		int[] existing = {10,20,30,40};
		for(int val: existing) l1.insertAtEnd(val);
		 
		System.out.print("Linked List: ");
		l1.display(reverse(head));
		
		Node n = null;
		System.out.print("Linked List: ");
		display(reverse(n));
	}

}
