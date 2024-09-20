package arrays_problems;

import java.util.Arrays;

public class ArraySorting {
	public static void sorting(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			}	
		}
	}
}
	public static void main(String args[]) {
		int arr[]= {1,2,5,3,4,0,-1};
		sorting(arr);
		System.out.println(Arrays.toString(arr));
	}
}