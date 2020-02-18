package a_pattern1.actual.observable;

import java.util.ArrayList;

import a_pattern1.actual.character.Observer;
import a_pattern1.actual.dao.Weather;

public class WeatherData implements Subject{
	ArrayList<Observer> list = new ArrayList<>();
	Weather w;
	
	@Override
	public void registerObserver(Observer ob) {
		list.add(ob);
	}

	@Override
	public void removeObserver(Observer ob) {
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) == ob) {
				list.get(i).deleteData();
				list.remove(i);
				System.out.println("제거완료");
				break;
			}
		}
	}

	@Override
	public void notifyObservers() {
		for(int i=0; i<list.size(); i++) {
			list.get(i).update(w);
		}
	}
	
	public void setWeather(Weather w) {
		this.w = w;
		notifyObservers();
	}
}
