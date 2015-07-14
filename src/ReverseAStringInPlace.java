package simplePrograms;

import java.util.Arrays;

public class ReverseAStringInPlace {
	
	public String reverseAString(String s){
		char[] charArray = new char[s.length()];
		for(int i=0;i<s.length();i++){
			charArray[i]=s.charAt(i);
		}
		//System.out.println(Arrays.toString(charArray));
		int i=0;
		int j=charArray.length-1;
		while(i<j){
			char temp=charArray[i];
			charArray[i]=charArray[j];
			charArray[j]=temp;
			//System.out.println(i);
			//System.out.println(j);
			i++;
			j--;
			
		}
		String reversedString = Arrays.toString(charArray);
		return reversedString;
	}
	
	public static void main(String args[]){
		ReverseAStringInPlace ReverseAStringInPlaceObj = new ReverseAStringInPlace();
		System.out.println((ReverseAStringInPlaceObj.reverseAString("hat")));
	}

}
