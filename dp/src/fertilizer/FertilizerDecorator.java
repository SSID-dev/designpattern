package fertilizer;

public abstract class FertilizerDecorator extends Fertilizer{
	public abstract String getDescription();
	public abstract int fertilize();
}