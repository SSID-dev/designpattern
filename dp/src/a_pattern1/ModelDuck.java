package a_pattern1;

public class ModelDuck extends Duck{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Model");
	}
	
	@Override
	public void fly() {
		System.out.println("날지 못해요..");
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("모델모델");
	}
	

}
