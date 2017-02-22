package app.tools.examples.car;

import java.util.ArrayList;
import java.util.List;

import app.tools.examples.exception.CarNotFoundException;

public class CarSearch {

	public List<Car> listAll() {
		List<Car> cars = new ArrayList<>();

		cars.add(new Car("Corvette", "Chevrolet", 1962));
		cars.add(new Car("Jaguar", "Jaguar", 1948));
		cars.add(new Car("Austin-Healey", "British Motor Corporation", 1959));
		
		return cars;
	}

	public Car search(String model) throws CarNotFoundException {
		return listAll().stream()
				.filter(car -> car.getModel().equalsIgnoreCase(model))
				.findFirst()
				.orElseThrow(() -> new CarNotFoundException());
	}

}
