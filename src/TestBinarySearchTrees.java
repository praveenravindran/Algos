package binarysearchtrees;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestBinarySearchTrees {
	public static void main(String args[]){
	
	BinarySearchTree tree1 = new BinarySearchTree();
	tree1.insert(18);
	tree1.insert(12);
	tree1.insert(15);
	tree1.insert(4);
	tree1.insert(1);
	tree1.insert(3);
	tree1.insert(13);
	tree1.insert(14);
	tree1.insert(17);
	tree1.insert(25);
	tree1.insert(23);
	tree1.insert(30);
	tree1.insert(28);
	tree1.insert(29);
	tree1.insert(2);
	//tree1.printTree();
	//tree1.remove(30);
	//tree1.remove(12);
	//System.out.println(tree1.root.lchild.item);
	//tree1.printTree();
	//tree1.findMaxLevel();
//	tree1.levelOrderTraversal();
	BinarySearchTree tree2 = new BinarySearchTree();
	tree2.insert(10);
	tree2.insert(6);
	tree2.insert(7);
	tree2.insert(15);
	tree2.insert(13);
	tree2.insert(11);
	tree2.insert(20);
	tree2.insert(22);
	tree2.insert(29);
	tree2.insert(41);
	tree2.insert(43);
	
	BinarySearchTree tree3 = new BinarySearchTree();
	//tree3.insert(8);
	tree3.insert(6);
	tree3.insert(7);
	tree3.insert(11);
	tree3.insert(13);
	tree3.insert(10);
	
	System.out.println(tree3.checkSubTrees(tree2, tree3));
	
	
	//System.out.println(tree3.root.lchild.item);
	//System.out.println(tree2.root.lchild.item);
	
	//System.out.println(tree2.checkSameTree(tree2.root, tree3.root));
	//System.out.println(tree2.sizeOf());
//	System.out.println(tree2.diameterOf());
	//tree3.delete();
	/*ArrayList<LinkedList<BinarySearchTreeNode>> al = new ArrayList<LinkedList<BinarySearchTreeNode>>();
	al = tree3.createArrayListOfLevels();
	LinkedList<BinarySearchTreeNode> list= new LinkedList<BinarySearchTreeNode>();
	list = al.get(3);
	BinarySearchTreeNode node = list.get(0);
	System.out.println(node.item);*/
	//tree3.findAncestor(7, 11);
	
	
//	ArrayList<BinarySearchTreeNode> al = new ArrayList<BinarySearchTreeNode>();
	//tree3.helperFindNextNode(al, this.root, 9);
	//tree3.printTree();
	//System.out.println(tree3.root.item);
	//tree3.printTree();
//	System.out.println(tree2.FindMinLevel());
//	System.out.println(tree2.findMaxLevel());
//	System.out.println(tree2.isBalanced());
//	tree2.printPaths();
//	tree1.printPaths();
//	tree2.linkedListOfPath();
//	tree2.printTree();
	
	//System.out.println(tree2.root.lchild.rchild.rchild.item);
	//tree2.mirrorTree();
	//System.out.println(tree2.root.lchild.rchild.rchild.item);
	//tree2.printTree();
	
	//System.out.println(tree1.findMaxLevel());
//	Boolean decision = tree1.find(49);
//System.out.println(decision);
//	int number = tree1.findMin();
//	System.out.println(number);
//	System.out.println(tree1.(12));
	
	
//	int blah =(int)tree1.find(18);
	//System.out.println(blah);
//	System.out.println(tree1.findSmallestValueGreaterThan(13).item);
	//System.out.println(tree1.root.lchild.rchild.item);
	}
}
