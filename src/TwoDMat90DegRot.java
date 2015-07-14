package simplePrograms;

import java.util.Arrays;

public class TwoDMat90DegRot {
	public int[][] roateMatBy90(int array[][]){
		int max =0;
		for(int i =0;i<array.length;i++){
			if(array[i].length>max)
				max=array[i].length;
		}
		int colSize = max-1;
		System.out.println(colSize);
		int b[][] = new int[array.length][colSize];
		//int top =0;
		for(int j=colSize;j>=0;j--){
		for(int i=0;i<=array.length;i++){
			b[i][j]= array[0][i];	
		}
		}
		System.out.println(Arrays.deepToString(b));
		return b;
	}
	
	public static void main(String args[]){
		TwoDMat90DegRot TwoDMat90DegRotObj = new TwoDMat90DegRot();
		int array[][]={ {1,1,1,1} , {0,0,0,0} ,{2,2,2,2} ,{3,3,3,3}};
		TwoDMat90DegRotObj.roateMatBy90(array);
	}
}
