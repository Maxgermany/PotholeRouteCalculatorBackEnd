package test;
import core.coordinates.impl.Coordinate;
import core.dimensions.impl.Dimensions;
import core.images.impl.Image;
import core.potholes.api.IPothole;
import core.potholes.impl.PhotographedMeasuredPothole;
import core.potholes.impl.PhotographedUnmeasuredPothole;

public class DummyData
{
	private final static String DEFAULT_IMAGE_URL = "https://sealmaster.net/wp-content/uploads/how-to-fix-a-pothole.png";
	
	public static IPothole[] potholes = new IPothole[] {
		new PhotographedUnmeasuredPothole(new Coordinate(52.5102588, 13.3767251), new Image("https://www.strutmasters.com/wp-content/uploads/2018/03/pothole_key.jpg")),
		new PhotographedUnmeasuredPothole(new Coordinate(52.5106378, 13.3767982), new Image(DEFAULT_IMAGE_URL)),
		new PhotographedUnmeasuredPothole(new Coordinate(52.5107553, 13.3773592), new Image("https://voiceofniagara.files.wordpress.com/2011/03/monstor-pothole.jpg")),
		new PhotographedUnmeasuredPothole(new Coordinate(52.5081096, 13.3759111), new Image("https://i.cbc.ca/1.5271337.1567691892!/fileImage/httpImage/image.jpg_gen/derivatives/16x9_780/pothole.jpg")),
		new PhotographedMeasuredPothole(new Coordinate(52.5078306, 13.3762024), new Image("https://www.kxly.com/content/uploads/2020/01/pothole-1-1024x768.jpg"), new Dimensions(9.00, 8.70, 3.50)),
		new PhotographedMeasuredPothole(new Coordinate(52.5121293, 13.4020852), new Image(DEFAULT_IMAGE_URL), new Dimensions(7.25, 3.10, 1.35)),
		new PhotographedMeasuredPothole(new Coordinate(52.5122547, 13.4020153), new Image("https://www.nvmpaving.com/wp-content/uploads/2018/02/Asphalt-Pothole-Repairs-1024x768.jpg"), new Dimensions(8.82, 6.30, 1.12)),
		new PhotographedMeasuredPothole(new Coordinate(52.5218591, 13.4137481), new Image("http://www.aciindiana.com/blog/wp-content/uploads/2016/04/Pothole-Repair-Indianapolis-IN-Copy.jpg"), new Dimensions(6.85, 6.70, 5.50))
	};
}