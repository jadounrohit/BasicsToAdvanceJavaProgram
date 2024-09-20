package java_8;
import java.util.Arrays;
import java.util.List;

public class PrintFirstElementFromLists{
	public static void main(String args[]){
		
		//Combine All the list and get the first element from all four list.
		List<Integer> l1=Arrays.asList(1,2,3);
		List<Integer> l2=Arrays.asList(8,2,5);
		List<Integer> l3=Arrays.asList(9,3,7);

		List<List<Integer>> lists=List.of(l1,l2,l3);
		List<Integer> result=lists.stream().map(n->n.get(0)).toList();
		System.out.println(result);
	}
}