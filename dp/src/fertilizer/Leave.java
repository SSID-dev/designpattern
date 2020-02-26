package fertilizer;

public class Leave extends FertilizerDecorator{
	Fertilizer f;
	public Leave(Fertilizer f) {
		this.f = f;
		description = ",낙엽";
		power = 2;
	}
	public String getDescription() {
		return f.getDescription() + description;
	}

	public int fertilize() {
		return f.fertilize() + power;
	}
}
