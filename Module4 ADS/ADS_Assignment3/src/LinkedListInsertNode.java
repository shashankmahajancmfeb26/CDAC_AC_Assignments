
public class LinkedListInsertNode {
	
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	Node head;
	
	void insertNode(int value){
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
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
	
	
	
	void display() {
		if(head == null) {
			System.out.println("Linked List is Empty");
		}
		Node current = head;
		System.out.print("Linked List: ");
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	public static void main(String[] args) {
		LinkedListInsertNode l = new LinkedListInsertNode();
		
		//Existing Linked List
		int[] existing = {10,20,30};
		for(int val: existing) l.insertAtEnd(val);
		
		//Insert a new node at the beginning of a LinkedList.
		l.insertNode(5);
		
		l.display();

	}

}
