package OOPs_Home_work2;

import java.util.Scanner;

/*
 *  Assume another company which is a laptop manufacturer company
 *   needs to develop laptopswhich does the following: 
 *  On unlocking thescreen it will display a “WELCOME” message first,
 *   After “ welcome “ message displays →
“Enter Option:”
1. Add-1
2. Subtract-2
3. Multiply-3
4. Quit-4
The user should be allowed to enter an option. 
If the user enters 1, a message needs to be displayed,
 */
public class company {
	int num1;
	int num2;
	int result;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		num2=sc.nextInt();
	}
	
	void Add()
	{
		input();
		result=num1+num2;
		System.out.println("the addition is :"+result);
	}
	void Subtract()
	{
		input();
		result=num1-num2;
		System.out.println("the Subtract is :"+result);
	}
	void Multiply()
	{
		input();
		result=num1*num2;
		System.out.println("the Multiply is :"+result);
	}
	void Quit()
	{
		System.out.println("there is no options: ");
	}
	
	void menu()
	{
		System.out.println("1. Add-1");
		System.out.println("2. Subtract-2");
		System.out.println("3. Multiply-3");
		System.out.println("4. Quit-4");
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the choice: ");
		int key=kb.nextInt();
		option(key);
	}
	
	void option(int key)
	{
		switch (key) {
		case 1:
			Add();
			menu();
			
			break;
		case 2:
			Subtract();
			menu();
			break;
		case 3:
			Multiply();
			menu();
			
			break;
		case 4:
			Quit();
			menu();
			
			break;

		default:
			System.out.println("Invalid option:");
			break;
		}
	}
	
	

}
