
public class Array19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0)
			{
				a[i]=2;
				
			}
		}
		for(int p:a)
		{
			System.out.print(p+" ");
		}

	}

}
