package dataStructureAlgorithmClassNotes;

public class FuntionExamples {
	public static int sum(int number) {
		int digitsum=0;
		while(number>0) {
		int lastdigit=number%10;
		number=number/10;
		digitsum+=lastdigit;
		}
		return digitsum;
	}
public static void main(String args[]) {
		System.out.println(sum(145));
	}
}
