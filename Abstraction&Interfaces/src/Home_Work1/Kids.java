package Home_Work1;

public class Kids implements VotingApp {
	int age;
	
	
	public Kids(int age) {
		super();
		this.age = age;
	}


	public void registerUser()
	{
		if(age<12)
		{
			System.out.println("You have successfully registered under Kids:");
		}
		else
		{
			System.out.println("You have not successfully registered");
			
		}
	}
	
	 public void requestVotingNumber()
	 {
		 if(age<12)
		 {
			 System.out.println("Sorry cannot go for voting because Age must be greater than 12 to vote");
		 }
	 }

}
