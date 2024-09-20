package arrays_problems;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestJavaEight {

	public static void main(String[] args) {
		int arr[]= {1,4,5,3,2,6,8};
		OptionalInt result=Arrays.stream(arr).distinct().sorted().skip(arr.length-3).findFirst();
		if(result.isPresent()) {
            System.out.println("Second highest number is: " + result.getAsInt());
        } 
		else {
            System.out.println("Array does not have enough unique elements.");
        }
    }
}
