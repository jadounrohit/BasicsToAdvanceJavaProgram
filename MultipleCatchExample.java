package exception_handling;

public class MultipleCatchExample {
	public static void main(String args[]) {
		try {
			int arr[]= {1,2,3,5};
			System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception 1");
		}
		catch(Exception e) {
			System.out.println("Exception 2");
		}
	}
}

//If you put arrayindexoutofbound exception after exception than it will give compiler error
//because parent class exception should come after child class exception(arrayindexoutofbound).
