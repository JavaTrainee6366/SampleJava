package OOPs;

public class ConstructorDemo {
	
	public ConstructorDemo()  //Default Constructor
	{
		System.out.println("Default Constructor");
	}
	
	//Parameterized
	
	public ConstructorDemo(int x)
	{
		System.out.println("Parametrized & value is::"+x);
	}
	
	
	public static void main(String[] args) {
		ConstructorDemo obj =new ConstructorDemo();
		ConstructorDemo obj1 =new ConstructorDemo(20);
		
		 new ConstructorDemo();
		 new ConstructorDemo(10);
	}

}
