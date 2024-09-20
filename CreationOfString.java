package string_problems;

public class CreationOfString {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		
		StringBuilder sb=new StringBuilder("rohit");
		StringBuilder sb1=new StringBuilder("rohit");
		System.out.println(sb.equals(sb1));
		
		String s4 = new String("java");
		System.out.println(s1==s2); //true
		System.out.println(s4==s1); //false
		System.out.println(s1.equals(s4));//true
		
	}

}
