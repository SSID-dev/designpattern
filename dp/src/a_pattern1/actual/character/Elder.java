package a_pattern1.actual.character;

import a_pattern1.actual.behavior.play.Dance;
import a_pattern1.actual.behavior.work.CleanWeed;

public class Elder extends Hero {

    public Elder() {
        wb = new CleanWeed();
        pb = new Dance();
    }

    @Override
    public void move() {
        System.out.println("전 늙어서 못 가는데요...");
    }
}
