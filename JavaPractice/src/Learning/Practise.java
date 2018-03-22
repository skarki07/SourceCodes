package Learning;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//String practice
		String str ="Payment $200 paid";
		System.out.println(str.charAt(8));
		
		System.out.println(str.indexOf("$"));
		System.out.println(str.substring(8));
		
	//Print the string in Reverse
		String s="sabina";
		for (int i=s.length()-1; i>=0; i--)
			
			System.out.print(s.charAt(i));	
		
	//class SumOfArray{
		int[] array = {2, 4, 6, 8, 10, 12};
		int sum = 0;
		//Advanced for loop
		for( int num : array) 
		sum = sum+num;
			      
			System.out.println("Sum of array elements is:"+sum);
			
	//Variables
			double myGrade = 270/100.0;
			
			System.out.println(myGrade);		
		
		

	}

}
