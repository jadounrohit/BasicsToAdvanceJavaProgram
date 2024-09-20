package arrays_problems;

public class BubbleSort {
		public static void sort(int arr[]) {
			int temp=0;
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=i+1;j<=arr.length-1;j++) {
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				System.out.println(arr[i]);
			}
		}
	
	
	public static void main(String[] args) {
		int[] arr ={ 12, 44, 23, 43, 21, 8, 0, 6, 45, 44, 58, 17 };
		sort(arr);
	}

}
