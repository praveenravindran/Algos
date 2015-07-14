package simplePrograms;

public class NumberOfTimesAnArrayIsRotated {
	public int findNumberOfTimesAnArrayIsRotated(int array[]){
		int low=0;
		int high=array.length-1;
		//int mid = low + high/2;
		//System.out.println(array[mid]);
		
		while(low<=high){
		if(array[low]<array[high])
			return low;
		int mid = low + high/2;
		// int next
		if(array[mid]<array[mid+1] && array[mid] < array[mid-1])
			return mid;
		if(array[mid]<=array[high])
			high = mid-1;
		if(array[mid]>=array[low])
			low=mid+1;
		//System.out.println(low);
		}
		return -1;
	}
	
	public static void main(String args[]){
		NumberOfTimesAnArrayIsRotated NumberOfTimesAnArrayIsRotatedObj = new NumberOfTimesAnArrayIsRotated();
		
	//	int array[] = {11,12,15,18,2,5,6,8};
		int array2[] = {8,11,12,15,18,2,5,6};
		System.out.println(NumberOfTimesAnArrayIsRotatedObj.findNumberOfTimesAnArrayIsRotated(array2));
	}
}
