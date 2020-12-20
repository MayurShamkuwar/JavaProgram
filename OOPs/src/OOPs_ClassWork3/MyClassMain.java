package OOPs_ClassWork3;
//Write a program to show the implementation and use of local, 
//instance and static variables in different context.
public class MyClassMain {
	static int a=5;

	public static void main(String[] args) {
		MyClass s=new MyClass();
		System.out.println(s.num);
		s.local_variable();
		System.out.println(a);
		s.static_method();
		MyClass.static_method();
	}

}
