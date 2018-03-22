package Learning;

public class ExceptionsDemo { //try catch mechanism

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		int c=0;
		
		try
		{
			int k=(a+b)/c;
			System.out.println(k);
		}
		catch (Exception e)
		{
			System.out.println("Catch the error pls");
		}
		
		finally
		{
			System.out.println("Close the browser");
		}
	}
	

}
