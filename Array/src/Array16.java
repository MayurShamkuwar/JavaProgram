
public class Array16 {

	public static void main(String[] args) {
		int[][] a={
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4}
			};
		
		
		for(int k=0; k<7; k++)
		{
			for(int i=0; i<a.length; i++)
			{
				for(int j=0; j<a[0].length; j++)
				{
					if(i+j==k)
					{
						System.out.print(a[i][j]+" ");
					}
				
				}
				
			}
			System.out.println();
		}

	}

}
