package simplePrograms;
import java.util.Arrays;

public class TwoDMatRotation {
	public void rotateTwoDMatrix(int array[][]){
		int max=0;
		for(int i =0; i < array.length;i++){
			if(array[i].length > max)
				max = array[i].length;
		}
		System.out.println(max);
		int topRow =0; // initial conditions
		int bottomRow = array.length-1;
		int leftCol = 0;
		int RightCol = max-1;
	//	System.out.println(RightCol);
		int dir =0;
		
		while(topRow <= bottomRow && leftCol<=RightCol){
			if(dir==0){
				for(int i=topRow;i<=RightCol;i++){
					System.out.print(array[topRow][i]+" ");
				}
				topRow++;
				dir=1;
			}
			if(dir==1){
				for(int i=topRow;i<=bottomRow;i++){
					System.out.print(array[i][RightCol]+" ");
				}
				RightCol--;
				dir=2;
			}
			if(dir==2){
				//System.out.println(" ");
				//System.out.println(bottomRow);
				for(int i=RightCol;i>=leftCol;i--){
					System.out.print(array[bottomRow][i]+" ");
				}
				bottomRow--;
				dir=3;
			}
			if(dir==3){
				for(int i =bottomRow;i>=topRow;i--){
					System.out.print(array[i][leftCol]+" ");
				}
				leftCol++;
				dir=0;
			}
		}
	}
	public static void main(String args[]){
	int array[][] = { {2,4,6,8} , {5,9,12,16} , {2,11,5,9}, {3,2,1,8} };
	System.out.println(Arrays.deepToString(array));
	
	TwoDMatRotation TwoDMatRotationObj = new TwoDMatRotation();
	TwoDMatRotationObj.rotateTwoDMatrix(array);
	//System.out.println(array[0].length);
	//int max=0;
	
	//System.out.println(max);
}

}
