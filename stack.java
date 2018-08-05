package pac;
/**
 * Use the list to realize the stack
 * @author CelloRen
 *
 */
public class stack {
	list listForStack=new list();
	
	public stack(){
		//None
	}
	
	//The operation push() pop() peek() isEmpty
	public void push(int val) {
		listForStack.addTail(val);
	}
	public int pop() {
		int result=listForStack.tail.val();
		listForStack.deleteTail();
		return result;
	}
	public int peek() {
		return listForStack.tail.val();
	}
	public String toString() {
		return listForStack.toString();
	}
	/**
	 * Test unit
	 * @param args
	 */
	public static void main(String[] args) {
		stack s=new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.toString());
	}
}
