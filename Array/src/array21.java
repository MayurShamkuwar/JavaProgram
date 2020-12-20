
public class array21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a={
			{1,2,3,4},
			{1,2,3,4},
			{1,2,3,4},
			{1,2,3,4}
		};
		int[][] b={
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4}
			};
		int[][] c= new int[4][4];
		System.out.println("array a:");
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("array b:");
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("array c:");
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)	
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
