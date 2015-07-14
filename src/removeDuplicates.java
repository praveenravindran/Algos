package simplePrograms;

import java.util.HashMap;
import java.util.Iterator;

public class removeDuplicates {
	
	public void removeDuplicatesFromString(String s){	
		/*if(s.length()==0)
			return false;
		if(s.length()==1)
			return true;*/
		char[] array = new char[256];
		String newString = "";
		for(int i=0;i<s.length();i++){
			int value = (int)s.charAt(i);
			if((int)array[value]==0){
				array[value]=s.charAt(i);
				newString = newString+s.charAt(i);
				}
		}
		
		System.out.println(newString);
		
			
	}
	
	public static void main(String args[]){
		//HashMap<Integer,Character> charDict = new HashMap<Integer,Character>();
		//char array[] = new char[256];
		//System.out.println((int)array[1]);
		removeDuplicates removeDuplicatesObj = new removeDuplicates();
		removeDuplicatesObj.removeDuplicatesFromString("praveen");
		
	}
			
			

}
