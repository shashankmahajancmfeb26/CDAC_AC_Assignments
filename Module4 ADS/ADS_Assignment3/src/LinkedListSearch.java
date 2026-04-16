public class LinkedListSearch {
	
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
	
	static int searchElement(Node head, int element) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.data == element) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
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
		LinkedListSearch l = new LinkedListSearch();
		
		//Existing Linked List
		int[] existing = {10,20,30,40};
		for(int val: existing) l.insertAtEnd(val);
		
		int element = 30;
        int result = searchElement(head, element);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
		
		//l.display();

	}

}
