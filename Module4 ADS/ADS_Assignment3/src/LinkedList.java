
public class LinkedList {
	
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	Node head;
	
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
		LinkedList l = new LinkedList();
		int[] existing = {5,10,15};			//Existing Linked List
		for(int val: existing) l.insertAtEnd(val);
		
		//Elements to insert:
		l.insertAtEnd(20);
		l.insertAtEnd(25);
		
		l.display();

	}

}
