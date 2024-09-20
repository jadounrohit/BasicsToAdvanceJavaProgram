package exception_handling;
class MyCustomRuntimeException extends RuntimeException {
    // Constructors
    public MyCustomRuntimeException() {
        super();
    }
public MyCustomRuntimeException(String message) {
        super(message);
    }
public MyCustomRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
class MyClass {
    public void doSomething(int value) {
        if (value < 0) {
            throw new MyCustomRuntimeException("Value cannot be negative");
        }
    }
}
public class CustomRuntimeExceptionExample {
    		public static void main(String[] args) {
    		MyClass myClass = new MyClass();
            try {
            	myClass.doSomething(-5);
            } 
            catch (MyCustomRuntimeException e) {
        	  	System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}