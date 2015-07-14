package simplePrograms;

public class NumberOfOccurences {
	public int findNumberOfOccurence(int a[], int number){
        int low=0;
        int high=a.length-1;
        int count=0;
        while(low<=high){
        if(a[low] == number)
            count=count+1;
        if(a[high]==number)
            count=count+1;
        low++;
        high--;
        }
        return count;
    }
    
    public static void main(String args[]){
    	NumberOfOccurences NumberOfOccurenceObj = new NumberOfOccurences();
        int a[] = {1,2,5,6,2,8,2,10};
        System.out.println(NumberOfOccurenceObj.findNumberOfOccurence(a,2));
}
}