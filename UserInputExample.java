package basicprogram;

import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the integer value of a ");
			System.out.println("enter the string name ");
			String name =sc.nextLine();	
			int a=sc.nextInt();
			System.out.println("the value of a is " +a );	
			System.out.println("the string name is " +name);
		}
	}

}
