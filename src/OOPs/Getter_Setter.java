package OOPs;

public class Getter_Setter {
	
	private double d;
	

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	private int x;
	
	private String n;

	public Getter_Setter(int x, String n, double d) {
		this.d = d;
		this.x = x;
		this.n = n;
	}

	public Getter_Setter() {
		
		
	}

}
