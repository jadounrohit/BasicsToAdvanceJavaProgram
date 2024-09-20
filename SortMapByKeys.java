package java_8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapByKeys {

	public static void main(String[] args) {
		Map<String, Integer> studentMap = new HashMap<String, Integer>();
        
        studentMap.put("D", 87);
        studentMap.put("B", 82);
        studentMap.put("C", 91);
        studentMap.put("A", 89);
        studentMap.put("M", 95);
        studentMap.put("N", 86);
                 
        Map<String, Integer> sortedStudentMap = studentMap.entrySet().stream()
         .sorted(Entry.comparingByKey())
         .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
       
        System.out.println("Before Sorting : ");        
        System.out.println(studentMap);         
        System.out.println("After Sorting : ");         
        System.out.println(sortedStudentMap);

	}

}
