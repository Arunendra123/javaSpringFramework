package spring.injectUsingMethodLookup;

public class Truck {
     public Engine getEngine() {
    	 System.out.println("This is Truck Engine");
		 return new Engine("This is Truck Engine");
     }
}
