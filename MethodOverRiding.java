package oops_problems;
class Vehicle {
	void run() {
	System.out.println("Running");
	}
}
class Bike extends Vehicle {
	void run() {
		System.out.println("Running safely");
	}	
}
public class MethodOverRiding{
	public static void main(String[] args) {
		Vehicle obj=new Bike();
		obj.run();
	}
}
