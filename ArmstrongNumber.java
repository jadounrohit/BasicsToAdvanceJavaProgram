package basicprogram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//a number that is equal to the sum of cubes of its digits Example. 370=27+343+0=367
		int num=370,number,temp,total=0;
		number=num;
		while(number!=0)
		{
			temp=number%10;
			total=total+temp*temp*temp;
			number=number/10;
		}
		if(total==num)
			System.out.println("the number is armstrong");
		else
			System.out.println("the number is not a armstrong");
	}

}

