package app.tools.examples.car;

public class Car {

	private String model;
	private String producer;
	private int year;

	protected Car(String model, String producer, int year) {
		this.model = model;
		this.producer = producer;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public String getProducer() {
		return producer;
	}

	public int getYear() {
		return year;
	}

}
