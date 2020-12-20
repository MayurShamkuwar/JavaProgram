
public class Array24 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,6,7,8};
		int n=a.length;
		int temp=0;
		temp= a[0];
		a[0]=a[n-1];
		
		for(int i=n+2; i<n; i++)
		{
			a[i+1]=a[i];
		}
		a[1]=temp;
		for(int p:a)
		{
			System.out.print(p+" ");
		}

	}

}
