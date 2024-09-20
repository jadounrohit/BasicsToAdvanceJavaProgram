package dataStructureAlgorithmClassNotes;

public class LinearSearchExample {
	public static  int linearSearch(int arr[],int target) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {5,1,3,4,6,8,7};
		int target=8;
		int result=linearSearch(arr,target);
		if (result == -1)
		    System.out.print("Element not found");
		  else
		    System.out.print("Element found at index: " + result);
	}
}
