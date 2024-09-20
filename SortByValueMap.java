package collection_problems;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValueMap {

	public static void main(String[] args) {
		Map<Integer, String> idNameMap = new HashMap<Integer, String>();              
        idNameMap.put(111, "Lisa");
        idNameMap.put(222, "Narayan");
        idNameMap.put(333, "Xiangh");
        idNameMap.put(444, "Arunkumar");
        idNameMap.put(555, "Jyous");
        idNameMap.put(666, "Klusener");
         
        List<Entry<Integer, String>> result = new LinkedList<>(idNameMap.entrySet());         
        Collections.sort(result, new Comparator<Entry<Integer, String>>() 
        {
            @Override
            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) 
            {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Map<Integer, String> sortedIdNameMap = new LinkedHashMap<Integer, String>();
        for (Entry<Integer, String> entry : result) 
        {
            sortedIdNameMap.put(entry.getKey(), entry.getValue());
        }         
        System.out.println("Before Sorting : ");        
        System.out.println(idNameMap);         
        System.out.println("After Sorting : ");         
        System.out.println(sortedIdNameMap);

	}

}
