package a_pattern1.actual.behavior.play;

import a_pattern1.actual.behavior.PlayBehavior;

public class Drinking implements PlayBehavior {

	@Override
	public void play() {
		System.out.println("막걸리를 마시며 논다");
	}

}