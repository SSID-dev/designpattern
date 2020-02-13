package a_pattern1.actual.behavior.work;

import a_pattern1.actual.behavior.WorkBehavior;

public class Harvest implements WorkBehavior {
    @Override
    public void work() {
        System.out.println("수확합니다 영차 영차");
    }
}
