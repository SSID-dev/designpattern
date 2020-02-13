package a_pattern1.actual.character;

import a_pattern1.actual.behavior.play.Dance;
import a_pattern1.actual.behavior.work.CleanWeed;
import a_pattern1.actual.behavior.work.Harvest;

public class Boy extends Hero {

    public Boy() {
        wb = new Harvest();
        pb = new Dance();
    }

    @Override
    public void move() {
        System.out.println("뿅뿅뿅 갑니다");
    }
}
