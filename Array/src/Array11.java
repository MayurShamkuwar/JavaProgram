
public class Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int n=a.length;
		System.out.println("orinal Array:");
		for(int p:a)
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
		int c[]=new int [n];
		for(int i=0; i<n; i++)
		{
			c[i]=a[i];
		}
		System.out.println("copy Array:");
		for(int p:c)
		{
			System.out.print(p+" ");
		}

	}

}
