package basicprogram;

public class PalindromeNumber {

	public static void main(String[] args) {
		int reminder,temp;
	      int sum=0;
	      int number=454;
	      temp=number;
	      while(number>0)
	         {
	           reminder=number%10;
	           sum=(sum*10)+reminder;
	           number=number/10;
	         }
	      if(temp==sum)
	         System.out.println(temp+ " is palindrome");
	      else
	         System.out.println(temp+ " is not a palindrome");

	}

}
