
public class Array14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int n=a.length;
		int m=a.length;
	
		
		int count=0;
		
		for(int i=0; i<n; i++)
		{
			boolean flag=true;
			for(int j=i+1; j<m; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					System.out.print("count:"+count);
				}
			}
			
		}
		
		System.out.println("final count:"+ count);
		 m=n-count+1;
		int [] b=new int [m];
		int count1=0;
		for(int i=0; i<n; i++)
		{
			boolean flag=true;
			for(int j=0; j<m; j++)
			{
				if(a[i]==b[i])
				{
					flag=false;
				}
			}
			if(flag)
			{
				b[count1++]=a[i];
			}
		}
		System.out.println("final array:");
		for(int p:a)
		{
			System.out.print(p+" ");
		}
		
		
		

	}

}
