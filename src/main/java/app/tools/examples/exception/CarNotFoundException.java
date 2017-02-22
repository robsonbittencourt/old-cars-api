package app.tools.examples.exception;

public class CarNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public CarNotFoundException() {
		super("Car not found");
	}

}
