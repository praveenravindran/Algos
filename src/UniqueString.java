package simplePrograms;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashMap;
import java.util.Hashtable;

public class UniqueString {
	
	public boolean checkIfUniqueString(String s){
		Hashtable<Integer,Boolean> blah = new Hashtable<Integer,Boolean>();
		for(int i =0;i<s.length();i++){
			int asciiValue = (int)s.charAt(i);
			if( blah.get(asciiValue)==null)
				blah.put(asciiValue, true);
			else
				return false;
			}
		return true;
	}
	
	
	public boolean checkUniqueStringWithSpace(String s){
		//ArrayList<Boolean> hash = new ArrayList<Boolean> ();
		int j=1;
		boolean set[] = new boolean[256];
		for(int i=0;i<=s.length()-2;i++){
			int value=(int)s.charAt(i);
			System.out.println(s.charAt(i));
			System.out.println(s.charAt(j));
			if(set[value]==false)
			set[value]=true;
			else
				return false;
		}
		return true;
		
		
		
	}
	
	public static void main(String args[]){
		UniqueString UniqueStringObj = new UniqueString();
		System.out.println(UniqueStringObj.checkUniqueStringWithSpace("paven"));
	}
}
