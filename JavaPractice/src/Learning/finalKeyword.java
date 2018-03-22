/*package Learning;

//Example of final variable
public class finalKeyword {
	
	final int a=7;
	
	public void run() {
		int a=9;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		finalKeyword FK = new finalKeyword();
		FK.run();
	
	}
}*/

//Example of final method:
package Learning;

public class finalKeyword extends Method{ //return type name must be same with final logic i/o public
	
	public void run() 
	{
		System.out.println("I am learning finalKeyword Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		finalKeyword FK = new finalKeyword();
		FK.run();
	
	}
}
