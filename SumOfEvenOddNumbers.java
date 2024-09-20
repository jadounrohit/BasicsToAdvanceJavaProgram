package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfEvenOddNumbers {

	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(1,2,3,4,5,6);
		
		//Print ODD And EVEN In One Line
		Map<Boolean, List<Integer>> result = al.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println(result);
		
		al.stream().filter(n->n%2==0).forEach(System.out::println);
		al.stream().filter(n->n%2!=0).forEach(System.out::println);
		
		int sumOfEvens = al.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of even numbers: " + sumOfEvens);
		
		int sumOfOdds = al.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of odd numbers: " + sumOfOdds);
	}
}