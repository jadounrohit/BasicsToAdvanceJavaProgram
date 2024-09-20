package basicprogram;

public class LeapYear {

	public static void main(String[] args) {
		int year=2009;
	    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
	     {
	       System.out.println(year+" is Leap Year");
	     }
	    else
	     {
	       System.out.println(year+" is not a Leap Year");
	     }

	}

}
