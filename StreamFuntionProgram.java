package java_8;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class StreamFuntionProgram {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(8,7,5,4,2,8,15);
		
		//1.Remove the Duplicate elements from List.
		List<Integer> result=list.stream().distinct().toList();
		System.out.println(result);
        
		//2. Square of the list from the list.
		list.stream().map(n->n*n).forEach(System.out::println);
		
		//3.filter the record which start with "1".
        list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
        
        //4.find the first element from the list.
        list.stream().findFirst().ifPresent(System.out::println);
        
        //5.sort the element present in the list.
        list.stream().sorted().forEach(System.out::println);
        
        //6.sort the list in alphabatically order
        List<String> al=Arrays.asList("rohit","ankit","mohit","praveen");
		List<String> list1=al.stream().sorted().toList();
		System.out.println(list1);
		
		//7.get the value of  maximum length of string object
		List<String> str=Arrays.asList("rohit","raj","shubham","aditya");
	    String MaxLengthString=str.stream().max(Comparator.comparingInt(String::length)).get();
	    System.out.println(MaxLengthString);  
	    
	    //8.sum the list of element?
	  	Optional<Integer> sum=list.stream().reduce((a,b)->a+b);
	  	System.out.println(sum.get());
	  		
	  	//9.sort and reverse order
	  	list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	  		
	  	//10.count the elements in list
	  	long count=list.stream().count();
	  	System.out.println(count);
	  		
	  	//11.remove duplicate
	  	Set<Integer> set=new LinkedHashSet<>();
	  	list.stream().filter(e->set.add(e)).forEach(System.out::println);
	  		
	  	//12.maximum element
	  	int max=list.stream().max(Integer::compare).get();
	  	System.out.println(max);
	  		
	  	//13.lowercase to uppercase
	  	List<String> AL=Arrays.asList("aa","bb","cc");
	  	List<String> result1=AL.stream().map(String::toUpperCase).toList();
	  	System.out.println(result1);
	}

}
