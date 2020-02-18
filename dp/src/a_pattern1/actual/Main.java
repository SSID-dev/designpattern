package a_pattern1.actual;

import a_pattern1.actual.behavior.play.*;
import a_pattern1.actual.behavior.work.*;
import a_pattern1.actual.character.*;

public class Main {
    public static void main(String[] args) {
        Boy b = new Boy();
        Girl g = new Girl();
		Elder e = new Elder();

		// 움직임 테스트
		g.move();
		b.move();
		e.move();

		// Boy Test - 레벨 9까지 올리겠습니다.
		for (int i = 0; i < 4; i++) {
			b.performPlay();
		}
		for (int i = 0; i < 4; i++) {
			b.performWork();
		}
		b.setWb(new SeedingTen());
		b.setPb(new Drinking());

		// Boy Test - 레벨 10으로 만들겠습니다.
		b.performWork();
		b.setWb(new SeedingTen());
		b.setPb(new Drinking());

		b.performWork();
    	b.performPlay();
    }
}
