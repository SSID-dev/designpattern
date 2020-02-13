package a_pattern1.actual.character;

import a_pattern1.actual.behavior.play.Drinking;
import a_pattern1.actual.behavior.PlayBehavior;
import a_pattern1.actual.behavior.work.*;
import a_pattern1.actual.behavior.WorkBehavior;

public abstract class Hero {
	
	WorkBehavior wb;
	PlayBehavior pb;
	
	int level;
	
	public abstract void move();
	
	public void levelUp() {
		level += 1;
	}
	
	public void performWork() {
		wb.work();
	}
	
	public void performPlay() {
		pb.play();
	}

	public void setWb(WorkBehavior wb) {
		if (wb instanceof SeedingTen || wb instanceof Trackter) { // Todo : 레벨 제한 행동
			if(level < 10) {
				System.out.println("work 내용을 변경할 수 없습니다!");
				return;
			}
		}
		this.wb = wb;
	} // end of setWb

	public void setPb(PlayBehavior pb) {
		if(pb instanceof Drinking) {	// Todo : 레벨 제한 행동
			if(level<10) {
				System.out.println("play 내용을 변경할 수 없습니다!");
				return;
			}
		}
		this.pb = pb;
	} // end of setPb


} // end of class-Hero
