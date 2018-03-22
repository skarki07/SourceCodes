package Learning;

public class thisKeyword {
	
	int a = 5;
	
	public void getData()
	{	
		int a = 6;
		int b = a+this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisKeyword tkwd= new thisKeyword();
		tkwd.getData();
		
	}

}
