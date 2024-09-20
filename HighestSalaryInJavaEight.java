package java_8;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
public class HighestSalaryInJavaEight {
	public static void main(String[] args) {
		Map<String,Integer> map=new LinkedHashMap<>();
		map.put("rohit", 10000);
		map.put("rajat", 13000);
		map.put("ankit", 14000);
		map.put("aditya", 12000);
		map.put("vikash", 15000);
		
		Map.Entry<String,Integer> result=map.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).toList().get(0);
	    System.out.println(result);
	}

}
