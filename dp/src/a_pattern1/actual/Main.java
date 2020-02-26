package a_pattern1.actual;

import a_pattern1.actual.behavior.WorkBehavior;
import a_pattern1.actual.behavior.play.*;
import a_pattern1.actual.behavior.work.*;
import a_pattern1.actual.character.*;
import a_pattern1.actual.dao.Weather;
import a_pattern1.actual.observable.WeatherData;
import fertilizer.Fertilizer;
import fertilizer.Leave;
import fertilizer.PigPoo;
import fertilizer.Soil;


public class Main {
    public static void main(String[] args) {
        Boy b = new Boy();
        Girl g = new Girl();
		Elder e = new Elder();
		WeatherData wd = new WeatherData();
		
		wd.registerObserver(b);
		
		// 움직임 테스트
		g.move();
		b.move();
		e.move();
		
		
		for (int i = 0; i < 30; i++) {
			int mise = (int) (Math.random()*100);
			int water = (int) (Math.random()*100);
			int temp = (int) (Math.random()*50);
			
			
			Weather w = new Weather(mise, water, temp);
			
			wd.setWeather(w);
			System.out.println(b.weather==null? "null입니다" : "null아님");
			
			if(i==29)
				wd.removeObserver(b);
			
			// Boy Test - 레벨 9까지 올리겠습니다.
			for (int j = 0; j < 4; j++) {
				b.performPlay();
			}
			for (int k = 0; k < 4; k++) {
				b.performWork();
			}
			b.setWb(new SeedingTen());
			b.setPb(new Drinking());
			
		}
		
		
		

//		// Boy Test - 레벨 10으로 만들겠습니다.
		b.performWork();
		b.setWb(new SeedingTen());
		b.setPb(new Drinking());

		b.performWork();
    	b.performPlay();
    	wd.setWeather(new Weather(30, 30, 20));
		Fertilizer f = new PigPoo();
		f = new Leave(f);
		f = new Soil(f);
		
		System.out.println(f.fertilize());
		System.out.println(f.getDescription());
		
		
    	b.setWb(new Fertilizing(f));
    	b.performWork();
    	
    }
}
