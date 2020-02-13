package a_pattern1.actual;

import a_pattern1.actual.behavior.play.*;
import a_pattern1.actual.behavior.work.*;
import a_pattern1.actual.character.*;

public class Main {
    public static void main(String[] args) {
        Boy b = new Boy();
        Girl g = new Girl();
    	b.move();
    	g.move();
    	b.performPlay();
    	b.performWork();
    	b.levelUp();
    	b.setPb(new Dance());
    	b.performPlay();
    	Elder e = new Elder();
    	e.move();
    	b.setWb(new SeedingTen());
    	for(int i=0; i<20; i++) {
    		b.levelUp();
    	}
    	b.setWb(new SeedingTen());
    	b.performWork();
    	b.setPb(new Drinking());
    	b.performPlay();
    }
}
