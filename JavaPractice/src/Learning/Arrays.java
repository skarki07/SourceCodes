package Learning;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Old fashioned array declaration 
		int a[] = new int[5]; //Declares array and allocates memory for the values
		a[0] = 3;
		a[1] = 6;
		a[2] = 9;
		a[3] = 12;
		a[4] = 16;//initialised value into the array
		
		//Popular way to declare the array
		int b[]= {2,4,6,8,10,12,14};
		
		for (int i=0;i<b.length;i++)
		{
			System.out.println(b[i]); //retrives values present in the array
		}
		

	}
	

}
