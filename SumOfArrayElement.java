package java_8;

import java.util.Arrays;

public class SumOfArrayElement {

	public static void main(String[] args) {
		int arr[]= {5,1,-2,3,-1,-4};
		Arrays.stream(arr).filter(n->n%2==0).map(n->n*n).forEach(System.out::println);
		
		int SumOfEvens= Arrays.stream(arr).filter(n->n%2==0).sum();
		
		int SumOfOdds = Arrays.stream(arr).filter(n->n%2!=0).sum();
		
		System.out.println("sum of even numbers "  + SumOfEvens);
		System.out.println( "sum of odd numbers "  + SumOfOdds);

	}
}
