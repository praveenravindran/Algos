package simplePrograms;

public class BinarySearch {
	
	public int performBinarySearch(int a[], int number){
		int low=0;
		int high=a.length-1;
		int mid = low+high/2;
		while(low<=high){
			if(number==a[mid])
				return mid;
			else if (number<a[mid])
				high=mid-1;
			else if(number>a[mid])
				low=mid+1;
		}
			System.out.println("not found");
			return -1;
	}
	public static void main(String[] args) {
		BinarySearch BinarySearchObj = new BinarySearch();
		int a[] = {1,5,10,30,90};
		int number=10;
		int blah =(BinarySearchObj.performBinarySearch(a, number));
		System.out.println(blah);
	}

}
