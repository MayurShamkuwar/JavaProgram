
public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},
					{1,2,3,4},
					{1,2,3,4},
					{1,2,3,4}
				};
		int n=a.length;
		int m=a.length;
	//	int[][] trans=new int ;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				a[i][j]=a[j][i];
				System.out.print(a[j][i]+" ");
				

			}
			System.out.println();
		}
		System.out.println();
		
	}

}
