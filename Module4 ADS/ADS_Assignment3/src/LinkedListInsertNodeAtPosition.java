public class LinkedListInsertNodeAtPosition {
	
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	Node head;
	
	public void insertAtPosition(int data, int position) {
	    Node newNode = new Node(data);
	    if (position == 0) {
	        newNode.next = head;
	        head = newNode;
	        return;
	    }

	    Node current = head;
	    
	    for (int i = 0; i < position - 1 && current != null; i++) {
	        current = current.next;
	    }

	    if (current == null) {
	        System.out.println("Position out of range");
	        return;
	    }

	    newNode.next = current.next;
	    current.next = newNode;
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
		LinkedListInsertNodeAtPosition l = new LinkedListInsertNodeAtPosition();
		
		//Existing Linked List
		int[] existing = {10,20,30,40};
		for(int val: existing) l.insertAtEnd(val);
		
		l.insertAtPosition(25,2);
		
		l.display();

	}

}
