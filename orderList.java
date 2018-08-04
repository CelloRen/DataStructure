package pac;

public class orderList {
	//private int size;
	private Node head;
	
	public orderList() {
		//this.size=0;
		this.head=null;
	}
	
	private class Node{
		private int val;
		private Node next;
		 Node(int val){
			this.val=val;
		}
	}
	
	public void addInorder(int val) {
		Node node = new Node(val);
		Node pre = null;
		Node current = head;
		            while(current != null && val > current.val){
		                pre = current;
		                current = current.next;
		            }
		            if(pre == null){
		                head = node;
		                head.next = current;
		            }else{
		                pre.next = node;
		                node.next = current;
		            }
	}
	
	public String toString() {
		String result="";
		Node curr=head;
		while(curr!=null) {
			result+=curr.val+"-->";
			curr=curr.next;
		}
		return result;
	}
	
	public static void main(String[] args) {
		orderList l=new orderList();
		l.addInorder(9);
		l.addInorder(-1);
		l.addInorder(5);
		System.out.println(l.toString());
	}
}
