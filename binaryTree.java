package pac;
/**
 * BinaryTree using linkedList
 * @author CelloRen
 *
 */
public class binaryTree {
	//If packaging set those as private
	 binaryTree leftChild;
	 binaryTree rightChild;
	 binaryTree root;
	 Object val;
	
	public binaryTree(Object val,binaryTree leftChild,binaryTree rightChild) {
		this.leftChild=leftChild;
		this.rightChild=rightChild;
		this.val=val;
	}
	
	public binaryTree(Object val) {
		this(val,null,null);
	}
	
	public binaryTree() {
		super();
	}
	
	public void createTree(Object[] vals) {
		
	}
	
	//������� root-left-right
	public void preorder(binaryTree root) {
		if(root!=null) {
			visit(root);
			preorder(root.leftChild);
			preorder(root.rightChild);
		}
	}
	//������� left-root-right
	public void inorder(binaryTree root) {
		if(root!=null) {
			preorder(root.leftChild);
			visit(root);
			preorder(root.rightChild);
		}
	}
	//������� left-right-root
	public void afterorder(binaryTree root) {
		if(root!=null) {
			preorder(root.leftChild);
			preorder(root.rightChild);
			visit(root);
		}
	}
	
	public Object visit(binaryTree node) {
		if(node==null) return null;
		return node.val;
	}
	
	
}
