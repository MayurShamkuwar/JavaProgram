
public class Array18 {

	public static void main(String[] args) {
		int a[]= {2,34,5,6,67,8,2,1,4,0};
		int n=a.length;
		
		for(int i=0; i<n-1; i++)
		{
			boolean flag=true;
			for(int j=i+1; j<n; j++)
			{
				if(a[i]<a[j])
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.print(a[i]+" ");
			}
		}
		

	}

}
