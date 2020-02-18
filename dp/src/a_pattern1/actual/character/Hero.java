package a_pattern1.actual.character;

import a_pattern1.actual.behavior.play.Drinking;
import a_pattern1.actual.behavior.PlayBehavior;
import a_pattern1.actual.behavior.work.*;
import a_pattern1.actual.behavior.WorkBehavior;
import a_pattern1.actual.dao.Weather;

public abstract class Hero implements Observer {

	public Weather weather;
	WorkBehavior wb;
	PlayBehavior pb;

	int level = 1;

	public abstract void move();

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

	public void performWork() {
		if (canBehave()) {
			wb.work();
			levelUp();
		} else {
			System.out.println("날씨가 영...");
		}
	}

	public void performPlay() {
		if (canBehave()) {
			pb.play();
			levelUp();
		} else {
			System.out.println("날씨가 영...");
		}
	}

	private void levelUp() {
		level += 1;
	}

	@Override
	public void update(Weather w) {
		weather = w;
	}

	private boolean canBehave() {
		if (weather == null) {
			System.out.println("오늘 날씨 정보가 어떤지 모르겠는데...");
		} else {
			if (0 <= weather.mise && weather.mise <= 60) {
				if (0 <= weather.water && weather.water <= 30) {
					if (10 <= weather.temp && weather.temp <= 40) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public void deleteData() {
		deleteWeatherData();
	}
	
	private void deleteWeatherData() {
		weather = null;
	}
	
} // end of class-Hero
