package fibonacciseries;

public class reversealinkedlist {
	
		public static void main(String[] args) {
			// creating a singly linked list
			SinglyLinkedList.Node 
		head = new SinglyLinkedList.Node(1); SinglyLinkedList linkedlist = new SinglyLinkedList(head);
			// adding node into singly linked list linkedlist.add(new SinglyLinkedList.Node(2)); 
			linkedlist.add(new SinglyLinkedList.Node(3)); 
			// printing a singly linked list 
			linkedlist.print(); 
			// reversing the singly linked list 
			linkedlist.reverse(); 
			// printing the singly linked list again 
			linkedlist.print(); } }
	/** * A class to represent singly list in Java * * @author WINDOWS 8 * */
	class SinglyLinkedList { 
		static class Node {
			private int data;
			private Node next; 
			public Node(int data) 
			{ this.data = data; } public int data()
			{ return data; } public Node next() { return next; } } 
		private Node head; public SinglyLinkedList(Node head)
		{ this.head = head; } 
		/** * Java method to add an element to linked list * @param node */
		public void add(Node node) { Node current = head; while (current != null)
		{ if (current.next == null) { current.next = node; break; }
		current = current.next; } } /** * Java method to print a singly linked list */ 
		public void print() { Node node = head; while (node != null) 
		{ System.out.print(node.data() + " "); node = node.next(); }
		System.out.println(""); } 
		/** * Java method to reverse a linked list without recursion */
		public void reverse() { Node pointer = head; Node previous = null,
				current = null; while (pointer != null) { current = pointer;
				pointer = pointer.next; 
				// reverse the link
				current.next = previous;
				previous = current; head = current; } } }
	
		
	



