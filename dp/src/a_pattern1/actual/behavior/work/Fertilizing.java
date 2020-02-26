package a_pattern1.actual.behavior.work;

import a_pattern1.actual.behavior.WorkBehavior;

public class Fertilizing implements WorkBehavior{
	
	Fertilizer f;

	@Override
	public void work() {
		System.out.println(f.getDescription());
		System.out.println(f.fertilize() + "회복되었습니다.");
	}

	public void setFertilizer(Fertilizer f) {
		this.f = f;
	}
	
}