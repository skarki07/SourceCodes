package Learning;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a[row][column] for multidimensional array (old fashioned)
		int a [][] = new int [2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=6;
		a[1][0]=1;
		a[1][1]=3;
		a[1][2]=5;
		
		//If you have to printout particular value then,		
		//System.out.println(a[0][2]);
		
		//New one
		int b[][]= {{3,6,9},{1,3,5}};
		//System.out.println(b[1][2]);
		
		for (int i=0;i<2;i++) 
		{
			for(int j=0;j<3;j++)
			{
			System.out.println(b[i][j]);
		}
	
	}

}
}
