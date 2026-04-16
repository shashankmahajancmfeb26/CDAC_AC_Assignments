public class LinkedListDeleteNodeByValue
{
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
	
	void deleteByValue(int value) {
	    if (head == null) return;

	    if (head.data == value) {
	        head = head.next;
	        return;
	    }

	    Node current = head;
	    Node prev = null;

	    while (current != null && current.data != value) {
	        prev = current;
	        current = current.next;
	    }

	    if (current == null) {
	        System.out.println("Value " + value + " not found.");
	        return;
	    }

	    prev.next = current.next;
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
		LinkedListDeleteNodeByValue l = new LinkedListDeleteNodeByValue();
		
		//Existing Linked List
		int[] existing = {10,20,30,40};
		for(int val: existing) l.insertAtEnd(val);
		
		l.deleteByValue(30);
		
		l.display();

	}

}
