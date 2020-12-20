package Class_work2;
/*
 *  Declare an abstract class Vehicle with an abstract method named
 *  numWheels().Provide the two subclasses Car and Truck each one 
 *  of which implements this method. Create instances of these two 
 *  subclasses and demonstrate the use of the numWheels() method.
 */
public class Demo_main {

	public static void main(String[] args) {
		
		Car s=new Car();
		 Truck s1=new Truck();
		 s.numWheels();
		 s1.numWheels();
	}

}
