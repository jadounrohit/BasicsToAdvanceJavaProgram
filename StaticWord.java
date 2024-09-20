package oops_problems;

public class StaticWord {
	static String school;
	String name;
	public static void main(String[] args) {
		StaticWord.school="jmv";
		StaticWord st1=new StaticWord();
		StaticWord st2=new StaticWord();
		st1.name="rohit";
		st2.name="raj";
		
		System.out.println(StaticWord.school);
		System.out.println(StaticWord.school);

	}

}
