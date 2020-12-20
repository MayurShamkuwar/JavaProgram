
public class Array17 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,8,5,8};
		
		boolean flag= true;
		if(a.length==b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i]!=b[i])
				{
					flag=false;
				}
			}
			if(flag)
			{
				System.out.println("same");
			}
			else
			{
				System.out.println("not same:");
			}
		}
		else
		{
			System.out.println("not same");
		}
	}

}
