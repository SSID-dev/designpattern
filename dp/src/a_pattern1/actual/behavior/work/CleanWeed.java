package a_pattern1.actual.behavior.work;

import a_pattern1.actual.behavior.WorkBehavior;

public class CleanWeed implements WorkBehavior {
    @Override
    public void work() {
        System.out.println("잔디를 뽑습니다.");
    }
}
