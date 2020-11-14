package core.test;
import core.coordinates.impl.Coordinate;
import core.dimensions.impl.Dimensions;
import core.images.impl.Image;
import core.potholes.api.IPothole;
import core.potholes.impl.PhotographedMeasuredPothole;
import core.potholes.impl.PhotographedUnmeasuredPothole;

public class DummyData
{
	private final static String defaultImageURL = "";
	
	public static IPothole[] potholes = new IPothole[] {
		new PhotographedUnmeasuredPothole(new Coordinate(52.5102588, 13.3767251), new Image(defaultImageURL)),
		new PhotographedUnmeasuredPothole(new Coordinate(52.5106378, 13.3767982), new Image(defaultImageURL)),
		new PhotographedUnmeasuredPothole(new Coordinate(52.5107553, 13.3773592), new Image(defaultImageURL)),
		new PhotographedUnmeasuredPothole(new Coordinate(52.5081096, 13.3759111), new Image(defaultImageURL)),
		new PhotographedMeasuredPothole(new Coordinate(52.5078306, 13.3762024), new Image(defaultImageURL), new Dimensions(9.00, 8.70, 3.50)),
		new PhotographedMeasuredPothole(new Coordinate(52.5121293, 13.4020852), new Image(defaultImageURL), new Dimensions(7.25, 3.10, 1.35)),
		new PhotographedMeasuredPothole(new Coordinate(52.5122547, 13.4020153), new Image(defaultImageURL), new Dimensions(8.82, 6.30, 1.12)),
		new PhotographedMeasuredPothole(new Coordinate(52.5218591, 13.4137481), new Image(defaultImageURL), new Dimensions(6.85, 6.70, 5.50))
	};
}
