package Home_Work1;

public class Demo_Main {

	public static void main(String[] args) {
		Kids k=new Kids(11);
		k.registerUser();
		k.requestVotingNumber();
		
		Adult a=new Adult(15);
		a.registerUser();
		a.requestVotingNumber();
	}

}
