package OOPs;

public class EncapDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Getter_Setter obj = new Getter_Setter();
		
		obj.setX(10);								//Loose Coupling
		obj.setN("ABC");
		obj.setD(23.54);
		
		Getter_Setter obj1 = new Getter_Setter(100, "Demo",34.4); //Tight Coupling
		
		System.out.println(obj.getN());
		System.out.println(obj.getX());
		
		System.out.println(obj1.getN());
		System.out.println(obj1.getX());
	}

}
