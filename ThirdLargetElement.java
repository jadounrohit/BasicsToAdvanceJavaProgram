package arrays_problems;
public class ThirdLargetElement {
	public static void main(String[] args) {
		int arr[]= {1,5,6,10,9,4,7};
		System.out.println(thirdLargest(arr));
	}
	public static int thirdLargest(int arr[]) {
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				third=second;
				second=first;
				first=arr[i];
			}else if(arr[i]>second) {
				third=second;
				second=arr[i];
			}else if(arr[i]>third) {
				third=arr[i];
			}
		}
		return third;
	}
}