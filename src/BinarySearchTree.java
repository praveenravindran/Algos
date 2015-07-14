package binarysearchtrees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//import trees.BinarySearchTreeNode;
//import trees.BinaryTreeNode;


public class BinarySearchTree {
	
	private int size;
	public BinarySearchTreeNode root;
	
	
	public void insert(Object obj){
		BinarySearchTreeNode node = new BinarySearchTreeNode (obj);
		if(this.root==null)
			root = node;
		traverseAndAdd(root,node);
	}
	
	public void traverseAndAdd(BinarySearchTreeNode node,BinarySearchTreeNode nodeTobeAdded){
		if((int)nodeTobeAdded.item<(int)node.item){
			if(node.lchild == null){
				node.lchild=nodeTobeAdded;
				node.lchild.parent = node;
			}
			traverseAndAdd(node.lchild,nodeTobeAdded);
		}
		if((int)nodeTobeAdded.item>(int)node.item){
			if(node.rchild == null){
				node.rchild=nodeTobeAdded;
				node.rchild.parent=node;
			}
			traverseAndAdd(node.rchild,nodeTobeAdded);
		}
		
	}
	public Boolean find(Object obj){
		if(root == null)
			return null;
	boolean decision=helperFinder(this.root,obj);
	return decision;
	}
	
	public Boolean helperFinder(BinarySearchTreeNode node,Object obj){
		if((int)obj==(int)node.item)
			return true;
		Boolean decision = false;
		if((int)obj<(int)node.item){
			if(node.lchild != null)
				 decision = helperFinder(node.lchild,obj);
		}
		if((int)obj>(int)node.item){
			if(node.rchild != null)
				 decision =helperFinder(node.rchild,obj);
		}
		return decision;
	}
	
	public int LargestObjectLessThan(Object obj){
		if (this.root==null)
			return 0;
		int LargestObj = helperLargestObj(this.root,obj);
		return LargestObj;
	}
	
	public int helperLargestObj(BinarySearchTreeNode node,Object obj){
		if((int)node.item == (int)obj)
			return (int)node.item;
		int item=0;
		if((int)obj < (int)node.item){
			if(node.lchild!=null)
			item=helperLargestObj(node.lchild,obj);}
		if((int)obj > (int)node.item){
			if(node.rchild!=null)
			item=helperLargestObj(node.lchild,obj);
	}
		if(item==0)
			System.out.println(node.item);
		return item;
		}

	
	public int findMin(){
		if (this.root==null)
				return 0;
		int min = helperFindMin(this.root);
				return min;
	}
	
	public int helperFindMin(BinarySearchTreeNode node){
		if(node.lchild==null)
			return (int)node.item;
		int min =0;
		min = helperFindMin(node.lchild);
		return min;		
	}
	
	public int findMax(){
		if (this.root==null)
			return 0;
		int max = helperFindMax(this.root);
			return max;
	}
	public int helperFindMax(BinarySearchTreeNode node){
		if(node.rchild==null)
			return (int)node.item;
		int max = helperFindMax(node.rchild);
		return max;
		
	}
	
	public void remove(Object k){
		BinarySearchTreeNode node = this.findNode(k);
	//	System.out.println(node.item);
	//	System.out.println(node.parent.item);}
		
		if(node.lchild==null && node.rchild==null){
			if ((int)node.parent.item<(int)node.item){
			node.parent.lchild=null;}
			if ((int)node.parent.item>(int)node.item){
				node.parent.rchild=null;}
		}
		//System.out.println(node.item);
		if(node.lchild==null && node.rchild!=null){
			if((int)node.item>(int)node.parent.item)
			node.parent.rchild=node.rchild;
			if((int)node.item<(int)node.parent.item)
			node.parent.lchild=node.rchild;}
			
		if(node.rchild==null && node.lchild!=null){
			if((int)node.item>(int)node.parent.item)
				node.parent.rchild=node.lchild;
			if((int)node.item<(int)node.parent.item)
				node.parent.lchild=node.lchild;
		}
		if(node.lchild!=null &&node.rchild!=null){
			//System.out.println(node.rchild.item);
			BinarySearchTreeNode smallestNodeNrchild = helperFindMinNode(node.rchild);
			Object temp = smallestNodeNrchild.item;
			//System.out.println(temp);
			
			this.remove(smallestNodeNrchild.item);
			node.item=temp;
		//	System.out.println(node.item);
		}
	}
	
	public BinarySearchTreeNode helperFindMinNode(BinarySearchTreeNode node){
		if(node.lchild==null)
			return node;
		BinarySearchTreeNode minNode;
		minNode = helperFindMinNode(node.lchild);
		return minNode;		
	}
	
	public BinarySearchTreeNode findNode(Object obj){
		if(this.root == null)
			return null;
	BinarySearchTreeNode decision=helperFinderNode(this.root,obj);
	return decision;
	}
	
	public BinarySearchTreeNode helperFinderNode(BinarySearchTreeNode node,Object obj){
		//System.out.println(node.item);
		if((int)obj==(int)node.item)
			return node;
		BinarySearchTreeNode foundNode = null;
		if((int)obj<(int)(node.item)){
			if(node.lchild != null)
				 foundNode = helperFinderNode(node.lchild,obj);
		}
		if((int)obj>(int)(node.item)){
			if(node.rchild != null)
				 foundNode =helperFinderNode(node.rchild,obj);
		}
		return foundNode;
	}
	
	public void printTree(){
		if(this.root==null)
			System.out.println("null");
		else{
		helperPrintTree(this.root);
		}
	}
	
	public void helperPrintTree(BinarySearchTreeNode node){
		if(node !=null ){
			helperPrintTree(node.lchild);
			System.out.println(node.item);
			helperPrintTree(node.rchild);
		}
	}
	public int findMaxLevel(){
		if (this.root==null){
			return 0;
		}
		else{
			int level =helperFindMaxLevel(this.root,0,0);
			return level;
		}
	}
	
	public int helperFindMaxLevel(BinarySearchTreeNode node,int lcount,int rcount){
		if(node.lchild!=null){
			lcount++;
			lcount =lcount+ helperFindMaxLevel(node.lchild,0,0);
			}
		if(node.rchild!=null){
			rcount += 1;
			rcount =rcount + helperFindMaxLevel(node.rchild,0,0);
		}
		if(rcount<lcount){
			return lcount;}
		else
			return rcount;
	}
	
	public void levelOrderTraversal(){
		helperLevelOrderTraversal(this.root);
	}
	
	public void helperLevelOrderTraversal(BinarySearchTreeNode node){
		TreeQueue q = new TreeQueue();
		if(node==null)
			System.out.println("empty");
		
		q.enqueue(node);
	//	BinarySearchTreeNode k = q.peek();
	//	System.out.println(k.item);
		while(!q.isEmpty()){
			BinarySearchTreeNode blah =q.front();
			if(blah.lchild!=null)
				q.enqueue(blah.lchild);
			if(blah.rchild!=null)
				q.enqueue(blah.rchild);
			System.out.println(q.front().item);
			q.dequeue();
	}
	}
	
	public int FindMinLevel(){
		int blah = helperFindMinLevel(this.root,0,0);
		return blah;
	}
	
	public int helperFindMinLevel(BinarySearchTreeNode node,int lcount,int rcount){
		if(node.lchild!=null){
			lcount++;
			lcount =lcount+ helperFindMaxLevel(node.lchild,0,0);
			}
		if(node.rchild!=null){
			rcount += 1;
			rcount =rcount + helperFindMaxLevel(node.rchild,0,0);
		}
		if(rcount<lcount){
			return rcount;}
		else
			return lcount;
	}
	
	public boolean isBalanced(){
		if((this.findMaxLevel()-this.FindMinLevel())>1)
		
			return false;
		return true;
	
	}
	
	public void printPaths(){
		int path[] = new int[100];
		helperPrintPath(this.root,path,0);
	}
	
	public void helperPrintPath(BinarySearchTreeNode node,int path[],int pathlength){
		if(node==null){
			System.out.println("empty");
			return ;
		}
		else{
			path[pathlength]= (int)node.item;
			pathlength++;
		}
		
		if(node.lchild!=null)
			helperPrintPath(node.lchild,path,pathlength);
		if(node.rchild!=null)
			helperPrintPath(node.rchild,path,pathlength);
		if(node.lchild==null && node.rchild==null){
			for(int i =0;i<pathlength;i++){
				System.out.print(path[i]+" ");
				//System.out.println("");
			}
			System.out.println("");
		}
	}
	
	public void mirrorTree(){
		helperMirrorTree(this.root);
	}
	
	public void helperMirrorTree(BinarySearchTreeNode node){
		if(node==null)
			return;
		else{
			BinarySearchTreeNode temp = node.lchild;
			node.lchild=node.rchild;
			node.rchild=temp;
		}
		helperMirrorTree(node.lchild);
		helperMirrorTree(node.rchild);
		
	}
	
	public boolean checkSameTree(BinarySearchTreeNode node1, BinarySearchTreeNode node2){
		if(node1==null && node2==null)
			return true;
		else if(node1 !=null && node2 !=null){
			return((int)node1.item)==(int)node2.item && checkSameTree(node1.lchild,node2.lchild) && checkSameTree(node1.rchild,node2.rchild);
		}
		else 
			return false;
		}
	
	public int sizeOf(){
		int size=0;
		size=helperSizeOf(this.root,size);
		return size;
	}
	
	public int helperSizeOf(BinarySearchTreeNode node, int size){
		if(node==null)
			return 0;
		else if(node!=null){
			size++;
			size = size + helperSizeOf(node.lchild,0)+helperSizeOf(node.rchild,0);
		}
		return size;
		
	}
	
	public int heightOfTree(){
		int height = helperheightOfTree(this.root);
		return height;
	}
	
	public int helperheightOfTree(BinarySearchTreeNode node){
		if(node==null)
			return 0;
		else
			return 1 + Math.max(helperheightOfTree(node.lchild), helperheightOfTree(node.rchild));
	}
	
	public int diameterOf(){
		int diameter =helperDiameterOf(this.root);
		return diameter;
	}
	
	public int helperDiameterOf(BinarySearchTreeNode node){
		if(node==null)
			return 0;
		//System.out.println(this.helperheightOfTree(node.rchild));
		return Math.max(1+this.helperheightOfTree(node.lchild)+this.helperheightOfTree(node.rchild),Math.max(helperDiameterOf(node.lchild),helperDiameterOf(node.rchild)));
	}
	
/*	public void delete(){
		helperDelete(this.root);
	}
	public void helperDelete(BinarySearchTreeNode node){
		if(node==null)
			return;
		else{
			while(node.lchild!=null){
				node.lchild=null;
				node=node.lchild;
			}
			while(node.rchild!=null){
				node.rchild=null;}
			
		}
		node=null;	
	}*/
	
	public ArrayList<LinkedList<BinarySearchTreeNode>> createArrayListOfLevels(){
		ArrayList<LinkedList<BinarySearchTreeNode>> al = new ArrayList<LinkedList<BinarySearchTreeNode>>();
		al = helperCreateArrayListOfLevels(this.root);
		return al;
	}
	
	public ArrayList<LinkedList<BinarySearchTreeNode>> helperCreateArrayListOfLevels(BinarySearchTreeNode node){
		ArrayList<LinkedList<BinarySearchTreeNode>> al = new ArrayList<LinkedList<BinarySearchTreeNode>>();
		LinkedList<BinarySearchTreeNode> list = new LinkedList<BinarySearchTreeNode>();
		if(this.root==null)
			return null;
		else{
			int level = 0;
			list.add(root);
			al.add(level, list);
			while(true){
				list = new LinkedList<BinarySearchTreeNode>();
				for(int i=0; i <al.get(level).size();i++){
				BinarySearchTreeNode tempnode =(BinarySearchTreeNode) al.get(level).get(i);
				if(tempnode!=null){
					if(tempnode.lchild !=null){
						list.add(tempnode.lchild);
					}
					if(tempnode.rchild !=null){
						list.add(tempnode.rchild);
					}
				}
				}
				if(!list.isEmpty()){
				al.add(level+1,list);
				}
				else{
					break;
				}
				level++;
			}
		}
		return al;
	}
	
	public void findNextNode(Object obj){
		ArrayList<BinarySearchTreeNode> al = new ArrayList<BinarySearchTreeNode>();
		al=inOrderTraversal(al,this.root);
		int index = 0;
		for(int i=0;i<al.size();i++){
		if(al.get(i).item==obj){
			index=i;
		}
		}
		System.out.println(al.get(index+1).item);
	}		
		
	public  ArrayList<BinarySearchTreeNode> inOrderTraversal(ArrayList<BinarySearchTreeNode> al,BinarySearchTreeNode node){
		if(node == null)
			return null;
		else{
			if(node.lchild!=null)
				inOrderTraversal(al,node.lchild);
			al.add(node);
			if(node.rchild!=null)
				inOrderTraversal(al,node.rchild);
		}
		return al;
	}
	
	
	public BinarySearchTreeNode findNodeMethod2(Object obj){
		BinarySearchTreeNode findnode=this.findNode(obj);
		BinarySearchTreeNode node=	helperFindNodeMethod2(findnode);
		System.out.println(node.item);
		return node;
	}
	
	public BinarySearchTreeNode helperFindNodeMethod2(BinarySearchTreeNode node){
		BinarySearchTreeNode nextNode = new BinarySearchTreeNode(0);
		if(node!=null){
			if(node.parent==null || node .rchild!=null){
				 nextNode = this.helperFindMinNode(node);
			}
			
			else
				nextNode = node.parent;
				while(nextNode!=null){
					if(nextNode.lchild==node)
						return nextNode;
					else
						return node;
				}
		}
		return null;
		}
	
	public BinarySearchTreeNode findAncestor(Object a,Object b){
		BinarySearchTreeNode node1 = this.findNode(a);
		BinarySearchTreeNode node2 = this.findNode(b);
		//System.out.println(node1.parent.item);
		//System.out.println(node2.parent.item);
		BinarySearchTreeNode ancestor = findFirstAncestor(node1,node2);
		System.out.println(ancestor.item);
		return ancestor;
	}
	
	public BinarySearchTreeNode findFirstAncestor(BinarySearchTreeNode node1,BinarySearchTreeNode node2 ){
		BinarySearchTreeNode p1 = node1.parent;
		BinarySearchTreeNode p2 = node2.parent;
		if(node1 ==null || node2 ==null)
			return null;
		if(p2==node1)
			return node1;
		if(p1==node2)
			return node2;
		else{
			if ( p1 == p2)
				return p1;
			
			while(p1.parent!=null &&p2.parent!=null){
				p1=p1.parent;
				p2=p2.parent;
				if(p1==p2)
					return p1;
			}
			return this.root;
			
	}
	}
	
	public boolean checkSubTrees(BinarySearchTree tree1, BinarySearchTree tree2){
		boolean decision = helperCheckSubTrees(tree1.root,tree2.root);
		return decision;
	}
	
	public boolean helperCheckSubTrees(BinarySearchTreeNode node1,BinarySearchTreeNode node2){
		ArrayList<BinarySearchTreeNode> al1 = new ArrayList<BinarySearchTreeNode>();
		ArrayList<BinarySearchTreeNode> al2 = new ArrayList<BinarySearchTreeNode>();
		al1=inOrderTraversal(al1,node1);
		al2=inOrderTraversal(al2,node2);
		String maintree ="";
		String subtree ="";
		//int blah = (int) al1.get(1).item;
		//maintree = (String) blah;
		for(int i=0;i<al1.size();i++){
			maintree = maintree +(int) al1.get(i).item;
		}
		for(int j=0;j<al2.size();j++){
			subtree = subtree + (int) al2.get(j).item;
		}
		System.out.println(maintree);
		System.out.println(subtree);
		char first = subtree.charAt(0);
		int n=1;
		boolean decision = false;
		for(int k=0;k<maintree.length();k++){
			if(maintree.charAt(k)== first){
				for(int m = k+1;m<k+subtree.length();m++){
					if(maintree.charAt(m)!=subtree.charAt(n)){
						decision = false;
							break;
					}
					else {
						decision=true;
						n++;
					}
				}
			}
		}
		return decision;
	}
	
	public boolean checkIfSubtree(BinarySearchTree tree1,BinarySearchTree tree2){
		boolean decision;
		if(tree1.root == null && tree2.root==null)
			return true;
		if(tree1.root==null && tree2.root!=null)
			return false;
		if(tree1.root!=null && tree2.root==null)
			return false;
		else
			 decision = helperCheckIfSubtree(tree1.root, tree2.root);
		return decision;
	}
	
	public boolean helperCheckIfSubtree(BinarySearchTreeNode node1, BinarySearchTreeNode node2){
		boolean decision=false;
		if(node1==null & node2==null)
			return decision=true;
		if(node1==null && node2!=null)
			return decision=false;
		if(node1!=null && node2==null)
			return decision=false;
		else{
		if(node1.item!=node2.item){
			decision=helperCheckIfSubtree(node1.lchild,node2);
			if(decision == false)
				decision = helperCheckIfSubtree(node1.rchild,node2);
		}
			if(node1.item==node2.item){
				return true;
			}
			if (node2.rchild!=null && node2.rchild!=null){
				helperCheckIfSubtree(node1.rchild,node2.rchild);
			}
		}
	}
	
}
			
					
					
					
					

	

	
	
	
	
	

