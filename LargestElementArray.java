package arrays_problems;

public class LargestElementArray {
    public static void main(String[] args){
        int arr[] ={10,20,100,40,90,50,60,70};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum value is : " + max);
    }
}