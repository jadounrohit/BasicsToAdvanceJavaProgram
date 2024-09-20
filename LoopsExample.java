package dataStructureAlgorithmClassNotes;

import java.util.Scanner;

public class LoopsExample {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the value of n ");
			int n=sc.nextInt();
			int sum=0;
			for(int i=1;i<=n;i++) {
				if(i%2==0) {
					sum+=i;
					System.out.println(i);
				}
			}
			System.out.println("Sum of Even Numbers " + sum);
		}
	}
}
