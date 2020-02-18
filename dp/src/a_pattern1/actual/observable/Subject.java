package a_pattern1.actual.observable;

import a_pattern1.actual.character.Observer;
import a_pattern1.actual.dao.Weather;

public interface Subject {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObservers();
}
