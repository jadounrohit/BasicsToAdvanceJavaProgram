package string_problems;

public class ReverseStringUsingRecursion {
	private static void ReverseString(String str,int temp) {
		if(temp>-1) {
		System.out.println(str.charAt(temp));
		ReverseString(str,temp-1);  
	}
}
	public static void main(String args[]) {
		String str1="Rohit";
		ReverseString(str1,str1.length()-1);
	}
}
