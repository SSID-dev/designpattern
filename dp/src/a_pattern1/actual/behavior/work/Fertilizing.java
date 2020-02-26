package a_pattern1.actual.behavior.work;

import a_pattern1.actual.behavior.WorkBehavior;
import fertilizer.Fertilizer;

public class Fertilizing implements WorkBehavior{
	
	Fertilizer f;
	public Fertilizing(Fertilizer f) {
		this.f = f;
	}
	@Override
	public void work() {
		if(f==null) {
			System.out.println("거름이 없다");
		}
		System.out.println(f.getDescription());
		System.out.println(f.fertilize() + "회복되었습니다.");
	}
	
	
}