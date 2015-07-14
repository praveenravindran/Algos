package simplePrograms;

import java.util.Arrays;

public class setToZero {
	public int[][] setToZeroMatrix(int a[][]){
		int row[] = new int [a.length];
		int col[] = new int [a[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if (a[i][j]==0){
					row[i]=1;
					col[j]=1;
				}
			}
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(row[i]==1 || col[j]==1)
					a[i][j]=0;
			}
		}
		System.out.println(Arrays.deepToString(a));
	return a;
	}
	
	public static void main(String args[]){
		setToZero setToZeroobj = new setToZero();
		int a[][] = { {1,1,0} , {1,0,1} , {1,1,1} };
		setToZeroobj.setToZeroMatrix(a);
	}
}
