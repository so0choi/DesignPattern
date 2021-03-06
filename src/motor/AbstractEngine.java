package motor;

public abstract class AbstractEngine implements Engine {
	private int size; // engine size
	private boolean turbo;

	public AbstractEngine(int size, boolean turbo) {
		this.size = size;
		this.turbo = turbo;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isTurbo() {
		return turbo;
	}
}
