package java_8;

import java.util.List;
import java.util.Arrays;

public class MaximumElementArrayList {

	public static void main(String[] args) {
		List<Integer> Al=Arrays.asList(5,3,4,6,9,10,7,1,2);
		int max=Al.stream().max(Integer::compare).get();
		System.out.println(max);
	}

}
