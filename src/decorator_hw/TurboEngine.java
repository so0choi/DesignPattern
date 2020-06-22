package decorator_hw;

public class TurboEngine extends AbstractEngine {

	public TurboEngine(int size) {
		super(size, true);
	}

	@Override
	public String toString() {
		return "TurboEngine";
	}

}
