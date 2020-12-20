
public class Array6 {

	public static void main(String[] args) {
		
			int a[][]= {{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				};
			int sum=0;
			int n=a.length;
			int m=a.length;

		for(int i=0; i<n; i++)
		{
				for(int j=0; j<m; j++)
				{
					sum=sum+a[i][j];
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
		}
		System.out.println("sum: "+sum);
		int d=n*m;
		double avg=sum/d;
		System.out.println("avg:"+avg);


		
		

	}

}
