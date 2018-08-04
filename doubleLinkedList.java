package pac;

public class doubleLinkedList {
	private int size;
	private Node head;
	private Node tail;
	
	public doubleLinkedList() {
		this.size=0;
		head=null;
		tail=null;
	}
	
	private class Node{
		private int val;
		private Node prev;
		private Node next;
		public Node(int val) {
			this.val=val;
		}
	}
	
	//AddHead
	public void addHead(int val) {
		Node newHead=new Node(val);
		if(size==0) {
			head=newHead;
			tail=newHead;
		}
		else {
			newHead.next=head;
			head.prev=newHead;
			head=newHead;
		}
		size++;
	}
	//AddTail
	public void addTail(int val) {
		Node newTail=new Node(val);
		if(size==0) {
			head=newTail;
			tail=newTail;
		}
		else {
			tail.next=newTail;
			newTail.prev=tail;
			tail=newTail;
		}
		size++;
	}
	//DeleteHead
	public Node deleteHead() {
		Node oldHead=head;
		if(size!=0) {
			head=head.next;
			head.prev=null;
			size--;
		}
		return oldHead;
	}
	//DeleteTail
	public Node deleteTail() {
		Node oldTail=tail;
		if(size!=0) {
			tail=tail.prev;
			tail.next=null;
			size--;
		}
		return oldTail;
	}
	//Return the size
	public int size() {
		return size;
	}
	//Judge empty
	public boolean isEmpty() {
		return size==0;
	}
	//Print
	public String toString() {
		String result="";
		Node curr=head;
		while(curr!=null) {
			result+=curr.val+"-->";
			curr=curr.next;
		}
		return result;
	}
	
	/**
	 * Unit test
	 * @param args
	 */
	public static void main(String[] args) {
		doubleLinkedList l=new doubleLinkedList();
		l.addHead(9);
		l.addHead(8);
		l.addTail(10);
		System.out.println(l.toString());
		l.deleteHead();
		System.out.println(l.toString());
	}
}
