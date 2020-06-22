package decorator_hw;

public class StandardEngine extends AbstractEngine {

	public StandardEngine(int size) {
		super(size, false);
	}

	@Override
	public String toString() {
		return "StandardEngine";
	}

}
