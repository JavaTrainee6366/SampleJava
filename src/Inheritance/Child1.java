package Inheritance;

public class Child1 extends Parent1{

	String name;
	public Child1(int x, int y, String name) {
		super(x, y);
		this.name = name;
	}
	
	public void show()
	{
		putData();
		System.out.println("name :: "+name);
	}
	

}
