package Home_Work1;

public class Adult {

int age;
	
	
	public Adult(int age) {
		super();
		this.age = age;
	}


	public void registerUser()
	{
		if(age>12)
		{
			System.out.println("You have successfully registered under Adults:");
		}
		else
		{
			System.out.println("You have not successfully registered");
			
		}
	}
	
	 public void requestVotingNumber()
	 {
		 if(age>12)
		 {
			 System.out.println("You have successfully registered under an Adult");
		 }
		 else
		 {
			 System.out.println("Oops, you are not");
		 }
	 }
}
