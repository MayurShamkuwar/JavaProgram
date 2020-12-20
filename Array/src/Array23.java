
public class Array23 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,6,7,8};
		int n=a.length;
		System.out.println(a.length);
		int temp;
		temp= a[0];
		
		
		for(int i=0; i<n-1; i++)
		{
			a[i]=a[i+1];
		}
		a[n-1]=temp;
		for(int p:a)
		{
			System.out.print(p+" ");
		}

	}

}
