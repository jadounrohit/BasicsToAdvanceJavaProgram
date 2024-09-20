package java_8;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class CountCharInString {
	public static void main(String args[]){
		List<String> str1=Arrays.asList("Rohit","Ajay","Onam");
		List<String> result=str1.stream().map(words->words.toLowerCase())
        .filter(word->word.charAt(0)=='a'||word.charAt(0)=='e'||word.charAt(0)=='i'
                           ||word.charAt(0)=='o'||word.charAt(0)=='u').toList();
		System.out.println(result);
		
		
		String str= "jadadoun";
		Map<Object,Long> result1= str.chars().mapToObj(t->(char)t)
				.collect(Collectors.groupingBy(t->t,Collectors.counting()));
		System.out.println(result1);
	}
}








