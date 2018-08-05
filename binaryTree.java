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
	
	//先序遍历 root-left-right
	public void preorder(binaryTree root) {
		if(root!=null) {
			visit(root);
			preorder(root.leftChild);
			preorder(root.rightChild);
		}
	}
	//中序遍历 left-root-right
	public void inorder(binaryTree root) {
		if(root!=null) {
			preorder(root.leftChild);
			visit(root);
			preorder(root.rightChild);
		}
	}
	//后序遍历 left-right-root
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
