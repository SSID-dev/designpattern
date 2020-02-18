package a_pattern1.actual.character;

import a_pattern1.actual.dao.Weather;

public interface Observer {
    void update(Weather w);
    
    void deleteData();
}
