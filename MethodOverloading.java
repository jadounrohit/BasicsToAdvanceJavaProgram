package oops_problems;


class Addition{
	 public int sum(int a,int b) {
		 return a+b;
	 }
	 public double sum(int a, double b) {
		 return a+b;
	 }
}
public class MethodOverloading {

	public static void main(String[] args) {
		Addition s=new Addition();
		System.out.println(s.sum(10, 20)); 
        System.out.println(s.sum(10, 20.5));
		
	}
	
}
