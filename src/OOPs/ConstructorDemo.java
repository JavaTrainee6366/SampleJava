package OOPs;

public class ConstructorDemo {


	public ConstructorDemo() // Default Constructor
	{

		System.out.println("Default Constructor-1");
	}

	// Parameterized

	public ConstructorDemo(int x) { 
		this(); 
		System.out.println("constructor-2");
	 // System.out.println("parametrized & value is::"+x); 
		}

	public ConstructorDemo(int x, int y) {
		this(y);
		System.out.println("Constructor-3");

	}

	public static void main(String[] args) {

		new ConstructorDemo(20, 30); // Invoke constructor

	}

}
