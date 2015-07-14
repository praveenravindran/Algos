package binarysearchtrees;

public class TreeQueue {	
		
		private  DListNode head;
		private DListNode tail;
		private int Maxsize=100;
		private int size=0;
		
		
		public void enqueue(BinarySearchTreeNode item){
			DListNode n = new DListNode(item);
			//if(size < Maxsize){
			if(head == null){
				head = n;
				head.prev = null;
				tail=n;
				tail.next=null;
			}
			
			else{
				tail.next = n;
				tail=n;
			}
			size = size+1;
			//System.out.println(size);
			}
		//	else
			//	System.out.println("full");
		//}
			
		
		public BinarySearchTreeNode dequeue(){
			if(head==null)
				return null;
			else
			{
			BinarySearchTreeNode temp = head.item;
			head = head.next;
			size = size-1;
			return temp;
		}
		}
		
		public BinarySearchTreeNode front(){
			if(head == null)
				return null;
			else
				return head.item;
		}
		
		public boolean isEmpty(){
			if(head==null)
				return true;
			else
				return false;
		}
		
		public boolean isFull(){
			if(size == Maxsize)
				return true;
			else
				return false;
		}
}