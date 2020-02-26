package fertilizer;

public class Trash extends FertilizerDecorator{
	Fertilizer f;
	public Trash(Fertilizer f) {
		this.f = f;
		description = ",음쓰";
		power = 3;
	}
	public String getDescription() {
		return f.getDescription() + description;
	}

	public int fertilize() {
		return f.power + power;
	}
}
