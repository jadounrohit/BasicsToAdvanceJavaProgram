package arrays_problems;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[]= {10,2,3,5,8,6};
		int temp,size;
		size=arr.length;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[size-2]);
	}
}
