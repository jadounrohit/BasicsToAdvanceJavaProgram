package java_8;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Remove_Duplicate {
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(1,2,3);
		List<Integer> l2=Arrays.asList(4,2,5);
		List<Integer> l3=Arrays.asList(9,3,6);
		List<Integer> l4=Arrays.asList(6,8,7);
		
		//Remove Duplicate Elements from more than 1 List.
		List<Integer> result5=Stream.concat(l1.stream(),l2.stream()).distinct().toList();
		System.out.println(result5);
		
		//Remove Duplicate Elements from more than 1 List.
		List<List<Integer>> lists = List.of(l1,l2,l3,l4);
		List<Integer> result=lists.stream().flatMap(List::stream).distinct().toList();
		System.out.println(result);
		
		//Remove Duplicate Elements from more than 1 List.
		Set<Integer> result1=Stream.of(l1,l2,l3,l4).flatMap(List::stream).collect(Collectors.toSet());
		List<Integer> resultSet=result1.stream().toList();
		System.out.println(resultSet);
		
		//Remove duplicate with stream funtion.
		List <Integer> AL= Arrays.asList(71, 18, 42, 21, 67, 32, 95,67,71);
		List<Integer> newlist=AL.stream().distinct().toList();
		System.out.println(newlist);
		
		//Print Duplicate element
		Set<Integer> set=new LinkedHashSet<Integer>();
		Set<Integer>result2=AL.stream().filter(i->!set.add(i)).collect(Collectors.toSet());
		System.out.println(result2);
		
		//Print and Remove Duplicate element  with set
		Set<Integer> set1=new LinkedHashSet<Integer>();
		for(int list:AL)
		{
		    if(set1.add(list)==true)
		    {
		        System.out.println(list);
		    }
		}
		int arr[]= {1,2,5,4,2,1};
		/*for(int newArray:arr){
		 	System.out.println(newArray);
		}*/
		Arrays.stream(arr).distinct().forEach(System.out::println);
	}
}