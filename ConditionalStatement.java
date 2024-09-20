package dataStructureAlgorithmClassNotes;
import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the character ");
			char ch = sc.nextLine().charAt(0);
			if(ch>='a' && ch<='z') {
				System.out.println("the character is in Lowercase ");
			}
			else if(ch>='A' && ch<='Z') {
				System.out.println("the character is in Uppercase ");
			}
		}
	}
}
