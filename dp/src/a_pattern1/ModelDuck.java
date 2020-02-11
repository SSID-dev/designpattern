package a_pattern1;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		// TODO Auto-generated constructor stub
		fb = new FlyNoWay();
	
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Model");
	}
	

	

}
