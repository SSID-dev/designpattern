package a_pattern1;

public abstract class Duck {
	Duck(){
		
	}
	public abstract void display();
	public void quack() {
		System.out.println("꽥");
	}
	public void swim() {
		System.out.println("모든 오리는 뜬다. 물오리도 뜬다");
	}
}
