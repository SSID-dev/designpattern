package fertilizer;

public abstract class Fertilizer {
	String description = "준비";
	int power = 0;
	
	public String getDescription() {
		return description;
	}
	
	public int fertilize() {
		return power;
	}
}
