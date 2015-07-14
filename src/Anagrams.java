package simplePrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import sortingAndSearching.BubbleSort;

public class Anagrams {
	
	public boolean checkIfAnagram(String s1,String s2){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		//HashMap<Integer,Integer> mapForString2 = new HashMap<Integer,Integer>();
		
		if(s1==null&& s2==null)
			return true;
		else if(s1.length()!=s2.length())
			return false;
		else{
			
			
			for(int i =0;i<s1.length();i++){
				char key=s1.charAt(i);
				if(map.get(key)==null)
					map.put(key, 1);
				else
					map.put(key,map.get(key)+1);
			}

		for(int i =0;i<s2.length();i++){
			char key=s2.charAt(i);
			if(map.get(key)==null)
				return false;
			else
				map.put(key, map.get(key)-1);
		}
		    Iterator it = map.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        if((int)pair.getValue()!=0)
		        	return false;
		        it.remove();
		    }
		    return true;
		}// avoids a ConcurrentModificationException
		
	}
	
	/*public boolean checkForAnagramBySort(String s1, String s2){
		BubbleSort obj = new BubbleSort();
		char[] s1arr = new char[s1.length()];
		char[] s2arr = new char[s1.length()];
		for(int i=0;i<s1.length();i++){
			s1arr[i] = s1.charAt(i);
		}
		for(int i=0;i<s2.length();i++){
			s1arr[2] = s2.charAt(i);
		}
		char[] s1sorted= obj.bubbleSort(s1arr);
		*/
		


	public static void main(String[] args) {
		//HashMap<Integer,Integer> mapForString1 = new HashMap<Integer,Integer>();
		//System.out.println(mapForString1.get(0));
		Anagrams checkIfAnagramObj = new Anagrams();
		System.out.println(checkIfAnagramObj.checkIfAnagram("blah", "hlab"));
		
		// TODO Auto-generated method stub

	}

}
