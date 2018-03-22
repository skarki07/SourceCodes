package Learning;

public class ConstructorDemo {
	
	/*Constructor is the block of codes similar to method but it executes when an object is created 
	 * Name of the constructor should be the class name(can't be different)
	 * Doesn't return the value, only returns when the object is initialized.
	 * 
	 */
	public ConstructorDemo () 
	{
		System.out.println("I am learning Constructor");
	}
	
	//Practice for parameterized constructor
	public ConstructorDemo (String str) 
	{
		System.out.println(str);
	}
	
	public ConstructorDemo (int a, int b) 
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ConstructorDemo cd = new ConstructorDemo();
		
		//Parameterized Constructor
		ConstructorDemo cdp = new ConstructorDemo("Parameterized constructor");
		ConstructorDemo c = new ConstructorDemo(6,7);

	}

}
/*Types of constructor:
 * Default - that returns null value if not defined.
 * Parameterized - returns the parameterized value
 */
