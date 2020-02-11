package a_pattern1;

public class WhiteheadDuck extends Duck{
	public WhiteheadDuck() {
		// TODO Auto-generated constructor stub
		fb = new FlyWithWings();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Whitehead");
	}



}
