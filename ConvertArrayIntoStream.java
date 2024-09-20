package java_8;

import java.util.stream.Stream;

public class ConvertArrayIntoStream {

	public static void main(String[] args) {
		String[] languages = {"Java", "Python", "JavaScript"}; 
		Stream<String> numbers = Stream.of(languages); 
		numbers.forEach(System.out::println); 
	}

}
