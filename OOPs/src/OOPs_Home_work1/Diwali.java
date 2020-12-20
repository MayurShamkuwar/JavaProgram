package OOPs_Home_work1;

import java.util.Scanner;

/*
 *  Let us Assume and do the programming: An organization provides
 *  Diwali bonus of 35% to their employees. If the year of service 
 *  of that employee is more than 5 years and gives Diwali bonus of
 * 15% to the employees if the year of service is less than 5 years.
 *  Now Create a class and its respective methods to enter the data 
 *  from the user and calculate total salary of the employee
 */
public class Diwali {
	
	double salary;
	int year;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary: ");
		salary=sc.nextDouble();
		System.out.println("Enter the year: ");
		year=sc.nextInt();
	}
	
	void bonus()
	{
		if(year>5)
		{
			salary=0.35*salary+salary;
			System.out.println("total salary: "+salary);
		}
		else
		{
			salary=0.15*salary+salary;
			System.out.println("total salary: "+salary);
		}
	}


}
