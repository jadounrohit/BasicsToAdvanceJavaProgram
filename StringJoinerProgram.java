package java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerProgram {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int n=scan.nextInt(); 
			List<String> lists=new ArrayList<String>(); 
			String temp;
			for(int i=0;i<n;i++) {
				temp=scan.next();
				lists.add(temp);
			}
			StringJoiner joiner=new StringJoiner("-");
			List<String> nameslist=lists.stream()
										.filter(names->names.length() % 3 == 0 || names.length()% 4 == 0)
										.collect(Collectors.toList());
			nameslist.forEach(joiner::add);
			System.out.println(joiner.toString());
		}

	}

}
