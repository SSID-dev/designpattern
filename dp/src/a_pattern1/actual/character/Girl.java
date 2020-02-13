package a_pattern1.actual.character;

import a_pattern1.actual.behavior.play.Dance;
import a_pattern1.actual.behavior.work.Seeding;

public class Girl extends Hero {

    public Girl() {
        wb = new Seeding();
        pb = new Dance();
    }

    @Override
    public void move() {
        System.out.println("총총총 갑니다");
    }
}
