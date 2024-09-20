package basicprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		int Num=16;
		boolean flag=false;
		for(int i=2;i<Num/2;i++) {
			if(Num%i==0){
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(Num+ " is prime number");
		}
		else
			System.out.println(Num+ " is not a prime number");
	}
}
