package simplePrograms;

import java.util.Arrays;

public class FirstAndLastOccurenceOf {
	
	public int[] findFirstAndLastOccurenceOf(int ip[], int number){
		int index[] = new int[2];
		int i=0;
		int j =ip.length-1;
		int flag=0;
		while(i!=j){
			if(ip[i]==number){
				index[0]=i;
				flag=1;
			}
			if(ip[j]==number){
				if(flag==0)
					index[0]=j;
				index[1]=j;
				flag=1;
			}
			i++;
			j--;
			}
		if(flag==0){
			System.out.println("no occurence");
			return null;
		}
		return index;
	}
		
	public static void main(String[] args) {
		FirstAndLastOccurenceOf FirstAndLastOccurenceOfObj = new FirstAndLastOccurenceOf();
		int ip[] = {5,2,4,2,5};
		int number=5;
		int index[] = FirstAndLastOccurenceOfObj.findFirstAndLastOccurenceOf(ip, number);
		System.out.println(Arrays.toString(index));

	}

}
