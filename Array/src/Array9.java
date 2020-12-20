
public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int b=6;
		boolean flag=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==b)
			{
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("not found");
		}
		

	}

}
