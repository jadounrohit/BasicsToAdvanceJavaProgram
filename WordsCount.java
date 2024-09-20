package java_8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsCount {

	public static void main(String[] args) {
		String str="Rohit Singh Jadoun Singh";
		Map<Object, Long> Result= Arrays.stream(str.split("\\s+"))
				.collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
		System.out.println(Result);

	}

}
