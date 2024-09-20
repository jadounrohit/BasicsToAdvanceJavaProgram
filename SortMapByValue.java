package java_8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapByValue {

	public static void main(String[] args) {
		Map<String,Integer> valueMap = new HashMap<String, Integer>();              
		valueMap.put("L",5);
		valueMap.put("N",3);
		valueMap.put("A",6);
		valueMap.put("B",1);
		valueMap.put("C",2);
		valueMap.put("D",4);
         
        //Java 8 sorting using Entry.comparingByValue()
        Map<String, Integer> sortedByValue = valueMap.entrySet().stream()
         .sorted(Entry.comparingByValue())
         .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,  e2) -> e1, LinkedHashMap::new));
         
        System.out.println("Before Sorting : ");         
        System.out.println(valueMap);         
        System.out.println("After Sorting : ");         
        System.out.println(sortedByValue);

	}
}
