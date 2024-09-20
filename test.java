package oops_problems;

class A{
	public void m1() {
		System.out.println("hi, from class A");
	}
}
class B extends A{
	public void m1() {
		System.out.println("hi, from class B");
	}
}

public class test{
	public static void main(String[] wheels) {
		A a= new A();
		a.m1();        //hi, from class A
		
		A a1= new B();
		a1.m1();       // hi, from class B
	
	}
}