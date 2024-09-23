package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
	public static void main(String args[]) {
		List<Integer> Al=Arrays.asList(10,20,30,100,80,40,50);
		Optional<Integer> sum=Al.stream().reduce((a,b)->a+b);
		System.out.println("Sum of numbers :" +sum.get());
	}

}
