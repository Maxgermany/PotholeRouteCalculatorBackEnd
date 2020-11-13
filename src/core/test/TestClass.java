package core.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import core.coordinates.impl.Coordinate;
import core.dimensions.impl.Dimensions;
import core.images.impl.Image;
import core.potholes.api.IPothole;
import core.potholes.impl.PhotographedMeasuredPothole;
import core.potholes.impl.PhotographedUnmeasuredPothole;
import core.potholes.impl.UnphotographedMeasuredPothole;
import core.potholes.impl.UnphotographedUnmeasuredPothole;
import core.routes.impl.MeinRoutenCalculator;
import core.routes.impl.Route;

public class TestClass
{
	static IPothole hole1 = new UnphotographedUnmeasuredPothole(new Coordinate(100.0, 72.2));
	static IPothole hole2 = new UnphotographedMeasuredPothole(new Coordinate(100.0, 72.2), new Dimensions(100, 60, 40));
	static IPothole hole3 = new PhotographedUnmeasuredPothole(new Coordinate(100.0, 72.2),
			new Image("/mein/Pfad/zum/bild.png"));
	static IPothole hole4 = new PhotographedMeasuredPothole(new Coordinate(100.0, 72.2),
			new Image("/mein/Pfad/zum/bild.png"), new Dimensions(99.2, 60, 40));

	static IPothole hole5 = new PhotographedUnmeasuredPothole(new Coordinate(100.0, 72.2),
			new Image("/mein/Pfad/zum/bild.png"));
	static IPothole hole6 = new PhotographedMeasuredPothole(new Coordinate(100.0, 72.2),
			new Image("/mein/Pfad/zum/bild.png"), new Dimensions(10, 10, 10));

//	static Route route = new Route(new IPothole[] { hole1, hole2, hole3, hole4, hole5, hole6 }, new IRouteCalculator()
//	{
//		@Override
//		public IPothole[] calculateAndGetRoute(IPothole[] potholes)
//		{
//			return potholes;
//		}
//	});
	
	static Route route = new Route(new IPothole[] { hole1, hole2, hole3, hole4, hole5, hole6 }, new MeinRoutenCalculator());

	public static void main(String[] args)
	{
		ObjectMapper objectMapper = new ObjectMapper();
		try
		{
			objectMapper.writeValue(new File("target/unphotographedUnmeasured.json"), hole1);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		ObjectMapper objectMapper2 = new ObjectMapper();
		try
		{
			objectMapper.writeValue(new File("target/unphotographedMeasured.json"), hole2);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		ObjectMapper objectMapper3 = new ObjectMapper();
		try
		{
			objectMapper.writeValue(new File("target/PhotographedUnmeasured.json"), hole3);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		ObjectMapper objectMapper4 = new ObjectMapper();
		try
		{
			objectMapper.writeValue(new File("target/PhotographedMeasured.json"), hole4);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		ObjectMapper objectMapper5 = new ObjectMapper();
		try
		{
			objectMapper.writeValue(new File("target/route.json"), route);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
