package string_problems;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		String str="Rohit singh Jadoun";
	     String words[]=str.split(" ");
	     StringBuilder reverse=new StringBuilder();
	     for(int i=words.length-1;i>=0;i--)
	       {
	           reverse.append(words[i]).append(" ");
	       }
	     System.out.println(reverse.toString().trim());

	}

}
