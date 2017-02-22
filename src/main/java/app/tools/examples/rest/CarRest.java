package app.tools.examples.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import app.tools.examples.car.Car;
import app.tools.examples.car.CarSearch;
import app.tools.examples.exception.CarNotFoundException;

@Path("/car")
public class CarRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public List<Car> listAll() {
		return new CarSearch().listAll();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/search/{model}")
	public Car listAll(@PathParam("model") String model) throws WebApplicationException {
		try {
			return new CarSearch().search(model);
		} catch (CarNotFoundException e) {
			throw new WebApplicationException(Response.status(Response.Status.NOT_FOUND)
					.entity(e.getMessage()).type(MediaType.APPLICATION_JSON).build());
		}
	}

}
