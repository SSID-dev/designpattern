package fertilizer;

public class Soil extends FertilizerDecorator{
	Fertilizer f;
	public Soil(Fertilizer f) {
		this.f = f;
		description = ",흙";
		power = 1;
	}
	public String getDescription() {
		return f.getDescription() + description;
	}

	public int fertilize() {
		return f.fertilize() + power;
	}
}
