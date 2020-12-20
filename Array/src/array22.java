
public class array22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={
				{1,2,3,4,5,6},
				{1,2,3,4,5,6},
				{1,2,3,4,5,6},
				{1,2,3,4,5,6},
				{1,2,3,4,5,6},
				{1,2,3,4,5,6}
			};
		int n=a.length;
		int m=a.length;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(i==0 || j==0 || i==n-1 || j==m-1)
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}

	}

}
