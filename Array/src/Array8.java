
public class Array8 {

	public static void main(String[] args) {
	
		int [] a= {1,4,5,6,6,6,7,8};
		int check =6;
		boolean flag=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==check)
			{
				flag=true;
				System.out.println("the index is:"+i);
			}
		}
		if(flag)
		{
			System.out.println("not found");
		}

	}

}
