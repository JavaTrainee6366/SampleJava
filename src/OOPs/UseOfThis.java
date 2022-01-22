package OOPs;

public class UseOfThis {
	String name;
	
	public UseOfThis(String name) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
	}
	
	public UseOfThis() {
		System.out.println("Default Running");
	}
	
	public void show() {
		
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		
		UseOfThis obj = new UseOfThis("Sayali");
		obj.show();
		
		UseOfThis obj1 = new UseOfThis("Sakshi");
		obj1.show();
		
		UseOfThis obj2 = new UseOfThis();
		obj2.show();
		
	}

}
