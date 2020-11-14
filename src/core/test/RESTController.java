package core.test;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import core.coordinates.impl.Coordinate;
import core.dimensions.impl.Dimensions;
import core.images.impl.Image;
import core.potholes.api.IPothole;
import core.potholes.impl.PhotographedMeasuredPothole;
import core.potholes.impl.PhotographedUnmeasuredPothole;
import core.routes.impl.GreedyRouteCalculator;
import core.routes.impl.Route;

@RestController
public class RESTController
{
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	private ArrayList<Greeting> greetings = new ArrayList<Greeting>();

	static IPothole hole3 = new PhotographedUnmeasuredPothole(new Coordinate(51.5010379, 9.9801803),
			new Image("/mein/Pfad/zum/bild.png"));
	static IPothole hole4 = new PhotographedMeasuredPothole(new Coordinate(51.5000379, 9.9806003),
			new Image("/mein/Pfad/zum/bild.png"), new Dimensions(1000.2, 60, 40));

	static IPothole hole5 = new PhotographedUnmeasuredPothole(new Coordinate(51.5040379, 9.9800803),
			new Image("/mein/Pfad/zum/bild.png"));
	static IPothole hole6 = new PhotographedMeasuredPothole(new Coordinate(51.5030379, 9.9830803),
			new Image("/mein/Pfad/zum/bild.png"), new Dimensions(10, 10, 10));

	static IPothole hole7 = new PhotographedUnmeasuredPothole(new Coordinate(51.501200379, 9.9812803),
			new Image("/mein/Pfad/zum/bild.png"));
	static IPothole hole8 = new PhotographedMeasuredPothole(new Coordinate(51.5047379, 9.9807803),
			new Image("/mein/Pfad/zum/bild.png"), new Dimensions(99.2, 60, 40));

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name)
	{
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping("/greeting")
	public Greeting newGreeting(@RequestBody Greeting newGreeting)
	{
		greetings.add(newGreeting);
		return newGreeting;
	}

	@GetMapping("/route")
	public Route route(@RequestParam(value = "id", defaultValue = "0") int id)
	{
		return new Route(new IPothole[] { hole3, hole4, hole5, hole6, hole7, hole8 }, new GreedyRouteCalculator(1, 10));
	}
	
	@GetMapping("/route")
    public Route route(@RequestParam(value = "id", defaultValue = "0") String id)
    {
        if(id.equals("1")) return new Route(new IPothole[] { hole3, hole4, hole5, hole6, hole7, hole8 }, new GreedyRouteCalculator(1, 10));
        return null;
    }

	@DeleteMapping("/pothole/{uuid}")
	public void deleteEmployee(@PathVariable UUID uuid)
	{
		System.out.println(uuid);
	}
}
