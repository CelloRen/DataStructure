package pac;

/**
 * Construct a LinkedList with a head and a tail
 * @author CelloRen
 *
 */
public class list {
	private int size;
	private Node head;
	private Node tail;
	
	
	//Initialize
	public list(){
		this.size=0;
		this.head=null;
		this.tail=null;
	}
	
	//The inner class node
	private class Node{
		private int val;
		private Node next;
		//initialize
		public Node(int val){
			this.val=val;
		}
	}
	
	//Add a Node before head
	public void addHead(int val){
		Node newHead=new Node(val);
		if(size==0) {//It means the list is empty
			head=newHead;
			tail=newHead;
		}
		else {
			newHead.next=head;
			head=newHead;
		}
		size++;
	}
	
	//Add a Node after tail
	public void addTail(int val) {
		Node newTail=new Node(val);
		if(size==0) {//It means the list is empty
			head=newTail;
			tail=newTail;
		}
		else {
			tail.next=newTail;
			tail=newTail;
		}
		size++;
	}
	
	//Delete the head node
	public boolean deleteHead() {
		if(size==0) return false;
		if(head.next==null) {
			head=null;
			tail=null;
		}
		else {
			head=head.next;//If you care the GC,set the oldHead as null
		}
		size--;
		return true;
	}
	
	//Delete the tail node
	public boolean deleteTail() {
		if(size==0) return false;
		if(size==1) {
			head=null;
			tail=null;
		}
		else {
		  Node curr=head;
		  while(curr.next!=tail) {
			curr=curr.next;
		  }
		  tail=curr;
		  curr.next=null;		  
		}
		size--;
		return true;
	}
	
	//Judge Empty
	public boolean isEmpty() {
		return size==0;
	}
	
	//Return the size
	public int size() {
		return  size;
	}
	
	//Print the list
	public String toString() {
		String result="";//SB?
		Node scan=head;
		while(scan!=null) {
			result+=scan.val+"-->";
			scan=scan.next;
		}
		return result;
	}
	
	/**
	 * Test unit
	 * @param args
	 */
	public static void main(String[] args) {
		list l=new list();
		/*
		l.addHead(0);
		l.addTail(1);
		l.addTail(2);
		System.out.println(l.toString());
		l.addHead(-1);
		System.out.println(l.toString());
		l.deleteHead();
		System.out.println(l.toString());
		l.deleteTail();
		System.out.println(l.toString());
		System.out.println(l.size);
		System.out.println(l.isEmpty());
		l.deleteHead();
		l.deleteHead();
		System.out.println(l.isEmpty());
		System.out.println(l.deleteHead());
		*/
	}
}
