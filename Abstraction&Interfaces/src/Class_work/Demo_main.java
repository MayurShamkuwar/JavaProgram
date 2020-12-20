package Class_work;
/*
 *  Define an abstract class named Shape that contains an empty 
 *  method named numberOfSides().Define three classes named
 * Trapezoid, Triangle and Hexagon such that each one of the classes
 *  extends the class. Shape. Each one of the classes contains only 
 *  the method numberOfSides() that displays the number of given
 *   geometrical figure.
Demonstrate how the trapezoid, triangle and hexagon classes can
 be instantiated and their methods can be tested.
 */
public class Demo_main {

	public static void main(String[] args) {
		
		Hexagon obj1=new Hexagon();
		Trapezoid obj2=new Trapezoid();
		Triangle obj3=new Triangle();
		
		obj1.numberOfSides();
		obj2.numberOfSides();
		obj3.numberOfSides();
	}

}
