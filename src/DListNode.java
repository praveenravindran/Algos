package binarysearchtrees;

public class DListNode {
			public BinarySearchTreeNode item;
			public DListNode next;
			public DListNode prev;
			
			public DListNode(BinarySearchTreeNode item){
				this.item = item;
				//this.next = next;
				//this.prev=prev;
			}
}