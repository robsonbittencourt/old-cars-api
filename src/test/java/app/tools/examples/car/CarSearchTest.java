package app.tools.examples.car;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import app.tools.examples.exception.CarNotFoundException;

public class CarSearchTest {

	@Test
	public void shouldListAllCars() {
		CarSearch carSearch = new CarSearch();
		List<Car> cars = carSearch.listAll();

		assertEquals(3, cars.size());
	}

	@Test
	public void shouldSearchACar() throws CarNotFoundException {
		CarSearch carSearch = new CarSearch();
		Car car = carSearch.search("corvette");

		assertEquals("Corvette", car.getModel());
		assertEquals("Chevrolet", car.getProducer());
		assertEquals(1962, car.getYear());
	}

}
