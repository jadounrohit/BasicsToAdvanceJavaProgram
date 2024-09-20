package basicprogram;
public class GarbageCollectorExample {
	@Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being finalized.");
    }
    public static void main(String[] args) {
        // Create some objects
        @SuppressWarnings("unused")
        Object obj1 = new Object();
        @SuppressWarnings("unused")
        Object obj2 = new Object();

        // Make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;
        
        @SuppressWarnings("unused")
        GarbageCollectorExample obj=new GarbageCollectorExample();
        obj=null;
        
        // Request garbage collection
        System.gc();
        System.out.println("Garbage collection requested.");
    }
}
//There are two ways to do it :
//1.Using System.gc() method: System class contain static method gc() for requesting 
                              //JVM to run Garbage Collector.
//2.Using Runtime.getRuntime().gc() method: Runtime class allows the application to interface
										  //with the JVM in which the application is running.