
public class Array13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		
		
		for(int i=0; i<a.length/2; i++)
		{
			a[i]=a[i]+a[a.length-1-i];
			a[a.length-1-i]=a[i]-a[a.length-1-i];
			a[i]=a[i]-a[a.length-1-i];
		}
		for(int p:a)
		{
			System.out.print(p+" ");
		}


	}

}
