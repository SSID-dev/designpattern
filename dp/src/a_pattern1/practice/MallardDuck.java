package a_pattern1.practice;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		fb = new FlyNoWay();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Mallard");
	}
}
