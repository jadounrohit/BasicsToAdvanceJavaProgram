package string_problems;

public class PrintCharacterCount {
	public static void main(String[] args) {
		String str="rahulpatidar";
		for(int i=0;i<=str.length()-1;i++) {
			int count=0;
			for(int j=0;j<=str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					 count++;
				}	
			}
			System.out.println(str.charAt(i) +" "+count);
		}
	}

}
