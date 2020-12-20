
public class Array15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,4,5,6,6,6,7,8};
		int ecount=0;
		int ocount;
		//int  size=8;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				ecount++;
			}
		}
		
		ocount=a.length-ecount;
		int [] e=new int [ecount];
		int [] o=new int [ocount];
		
		int ei=0;
		int oi=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				e[ei]=a[i];
				ei++;
			}
			else
			{
				o[oi]=a[i];
				oi++;
			}
		}
		System.out.println("Even array:");
		for(int p : e)
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
		System.out.println("odd array:");
		for(int p : o)
		{
			System.out.print(p+" ");
		}
		System.out.println();

	}

}
