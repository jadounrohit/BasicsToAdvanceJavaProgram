package basicprogram;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//fibonacci series 1,2,3,5,8,13,21
		
		int a=0,b=1,c;
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(a + ", ");
		}
		
	}

}
