package java_8;

import java.util.Map;
import java.util.stream.Collectors;

public class PrintDuplicateCharacterCount {

	public static void main(String[] args) {
		String str="rohitsinghjadooun";
		Map<Object,Long> result= str.chars().mapToObj(t->(char)t)
				.collect(Collectors.groupingBy(t->t,Collectors.counting()));
		//System.out.println(result);
		
		result.entrySet().stream().filter(entry->entry.getValue()>1)
					.forEach(entry->System.out.println(entry.getKey()+":"+ entry.getValue()));
				
	}
}
