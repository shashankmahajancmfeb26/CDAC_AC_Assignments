public class LinkedListCountNodes {
	
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
	
	public static int getCount(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
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
		LinkedListCountNodes l = new LinkedListCountNodes();
		
		//Existing Linked List
		int[] existing = {10,20,30,40};
		for(int val: existing) l.insertAtEnd(val);
		
		System.out.print("Total nodes: "+getCount(head));
		
	}

}
