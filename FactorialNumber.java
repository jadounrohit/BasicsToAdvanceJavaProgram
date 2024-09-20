package basicprogram;

public class FactorialNumber {

	public static void main(String[] args) {
		// Factorial Number 5 = 120 5*4*3*2*1
		int n=5;
		long factorial=1;
		for(int i=1;i<= n;i++)
			{
				factorial*=i;
				System.out.println(factorial);
			}
	}
}
