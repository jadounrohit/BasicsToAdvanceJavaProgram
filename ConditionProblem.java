package java_8;

import java.util.Arrays;

public class ConditionProblem {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		//List<Integer> al=Arrays.asList(1,2,3,4,5,6);
		long count1=Arrays.stream(arr).sorted().map(n->n*n).filter(n->n%2==0).count();
		System.out.println(count1);	
	}
}

//1,2,3,4,5,6
//1,4,9,16,25,36
//4,16,36


