package Class_work;

import java.util.Scanner;

public class EmployeeDemo {
	protected int emp_id;
	public String emp_name;
	private int emp_salary;
	 int emp_dept;
	 
	 void input()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the emp id: ");
		 emp_id=sc.nextInt();
		 System.out.println("Enter the emp_name: ");
		 emp_name=sc.next();
		 System.out.println("Enter the emp_salary: ");
		 emp_salary=sc.nextInt();
		 System.out.println("Enter the emp_dept: ");
		 emp_dept=sc.nextInt();
		 
	 }
	 
	public void doPUBlic()
	 {
		 System.out.println(emp_dept+" "+ emp_id+" "+emp_name+" "+emp_salary);
	 }
	 
	 void doDefaULt()
	 {
		 System.out.println(emp_dept+" "+ emp_id+" "+emp_name+" "+emp_salary);
	 }
	 protected void doProtected()
	 {
		 System.out.println(emp_dept+" "+ emp_id+" "+emp_name+" "+emp_salary);
	 }
	private void doPrivate()
	 {
		System.out.println(emp_dept+" "+ emp_id+" "+emp_name+" "+emp_salary);
	 }

}
