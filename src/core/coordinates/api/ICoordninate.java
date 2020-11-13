package core.coordinates.api;

public interface ICoordninate
{
	public double getLatitude();
	
	public double getLongitude();
	
	public double getDistanceTo(ICoordninate coordinate);
}
