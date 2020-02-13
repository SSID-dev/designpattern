package a_pattern1.actual;

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
		
		if(wb instanceof Seeding || wb instanceof CleanWeed || wb instanceof Harvest) {
			this.wb = wb;
			return;
		}
		
		else {
			if(level<10) {
				System.out.println("work 내용을 변경할 수 없습니다!");
				return;
			}
			
			else {
				this.wb = wb;
				return;
			}
			
		}
		
	} // end of setWb

	public void setPb(PlayBehavior pb) {
		if(pb instanceof Drinking) {
			
			if(level<10) {
				System.out.println("play 내용을 변경할 수 없습니다!");
			}
			
			else {
				this.pb = pb;
			}
		}
		
		else {
			this.pb = pb;
		}
		
		return;
	} // end of setPb


} // end of class-Hero
