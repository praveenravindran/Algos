package simplePrograms;

import java.util.Arrays;

public class RotateAnArray {
	
	public int[] letsRotateBy(int org[],int n){
		if(org.length==0)
			return null;
		if(org.length==1)
			return org;
		int rotated[]=new int[org.length];
		for(int i =0;i<org.length;i++){
			rotated[(i+n)%org.length]= org[i];
		//	int temp = org[(i+1)%4];
		//	org[(i+1)%4] = org[i];
		}
		return rotated;
	}
	
	public static void main(String args[]){
		RotateAnArray RotateAnArrayObj= new RotateAnArray();
		int array[] = {1,2};
		int rotated[] = RotateAnArrayObj.letsRotateBy(array, 2);
		System.out.println(Arrays.toString(rotated));
	}
}
