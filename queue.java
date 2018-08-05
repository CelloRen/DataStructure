package pac;

/**
 * Use the doubleLinkedList to realize the queue
 * @author CelloRen
 */
public class queue {
	doubleLinkedList list=new doubleLinkedList();
	
	public queue() {
		//None
	}
	
	//The operation enqueue() dequeue() isEmpty() 
	public void enqueue(int val) {
		list.addHead(val);
	}
	public int dequeue() {
		return list.deleteTail().value();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public String toString() {
		return list.toString();
	}
	
	/**
	 * Test unit
	 * @param args
	 */
	public static void main(String[] args) {
		queue q=new queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.toString());
		q.dequeue();
		System.out.println(q.toString());
	}
	
}
