package simplePrograms;

import java.util.LinkedList;


public class ReverseALinkedList {
	
	public LinkedList<Integer> listReverserIterative(LinkedList<Integer> list){
		LinkedList<Integer> reversedList = new LinkedList<Integer>();
		if(list.size()==0){
			System.out.println("empty list");
			return null;
		}
		if(list.size()==1){
			reversedList.add(list.peek());
			return reversedList;
		}
		
	}
	
	
	
	public static void main(String args[]){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		ReverseALinkedList ReverseALinkedListObj = new ReverseALinkedList();
		LinkedList<Integer> reversedList = ReverseALinkedListObj.listReverserIterative(list);
		//reversedList.
		
	}
}
