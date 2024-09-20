package string_problems;

public class Reverse_String {

	public static void main(String[] args) {
		String str="Rohit";
		String revstr=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr+=str.charAt(i);
		}
		System.out.println(revstr);

	}

}
