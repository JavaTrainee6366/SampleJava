package OOPs;
import static java.lang.System.out;  //Static import
public class StaticDemo {
	
	static String s2;
	String s1;
	final static int x; //Constant 
	
	static {  //static block
		x=100;
		out.println("Static Block "+x);
	}
	public StaticDemo(String s1,String s2) {
		// TODO Auto-generated constructor stub
		this.s1 = s1;
		this.s2 = s2;
	}
	
	static void display() {   //static method  	
		out.println(s2);	
	}	
	void show() {	
		out.println(s2+" is a "+s1);
	}
	
	public static void main(String[] args) {
		StaticDemo obj = new StaticDemo("Programming Language","Java");
		StaticDemo obj1 = new StaticDemo("PL","Python");
		obj1.show();
		obj.show();
		display();
	}
}
