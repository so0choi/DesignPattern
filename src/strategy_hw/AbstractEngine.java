package strategy_hw;

public abstract class AbstractEngine implements Engine {
	private int size;
	private boolean turbo;

	public AbstractEngine(int size, boolean turbo) {
		this.size = size;
		this.turbo = turbo;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public boolean isTurbo() {
		return this.turbo;
	}
}
