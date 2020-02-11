package a_pattern1;

public abstract class Duck {
	FlyBehavior fb;
	QuackBehavior qb;
	Duck(){
		
	}
	public abstract void display();
	public void swim() {
		System.out.println("모든 오리는 뜬다. 물오리도 뜬다");
	}
	public void performFly() {
		fb.fly();
	}
	public void performQuack() {
		qb.quack();
	}
}
