package core.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import core.coordinates.api.ICoordninate;
import core.coordinates.impl.Coordinate;
import core.dimensions.impl.Dimensions;
import core.images.impl.Image;
import core.potholes.api.IPothole;
import core.potholes.impl.PhotographedMeasuredPothole;
import core.potholes.impl.PhotographedUnmeasuredPothole;
import core.routes.impl.GreedyRouteCalculator;
import core.routes.impl.Route;

public class TestClass
{
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

	
//	static Route route = new Route(new IPothole[] { hole1, hole2, hole3, hole4, hole5, hole6 }, new IRouteCalculator()
//	{
//		@Override
//		public IPothole[] calculateAndGetRoute(IPothole[] potholes)
//		{
//			return potholes;
//		}
//	});

	static Route route = new Route(new IPothole[] { hole3, hole4, hole5, hole6, hole7, hole8 }, new GreedyRouteCalculator(1, 8));

	public static void main(String[] args)
	{
		ObjectMapper objectMapper = new ObjectMapper();
		try
		{
			objectMapper.writeValue(new File("target/PhotographedUnmeasured.json"), hole3);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		try
		{
			objectMapper.writeValue(new File("target/PhotographedMeasured.json"), hole4);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		try
		{
			objectMapper.writeValue(new File("target/route.json"), route);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		ICoordninate c = new Coordinate(40.7486, -73.9864);
		System.out.println(c.getDistanceTo(new Coordinate(40.748601, -73.986401)));

	}
}
