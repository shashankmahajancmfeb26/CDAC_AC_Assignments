public class LinkedListDeleteLastNode
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
	
	public void deleteLastNode() {
	    if (head == null) {
	        System.out.println("List is empty.");
	        return;
	    }

	    if (head.next == null) {
	        head = null;
	        return;
	    }
	    Node secondLast = head;
	    while (secondLast.next.next != null) {
	        secondLast = secondLast.next;
	    }
	    secondLast.next = null;
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
		LinkedListDeleteLastNode l = new LinkedListDeleteLastNode();
		
		//Existing Linked List
		int[] existing = {10,20,30,40};
		for(int val: existing) l.insertAtEnd(val);
		
		l.deleteLastNode();
		
		l.display();

	}

}
