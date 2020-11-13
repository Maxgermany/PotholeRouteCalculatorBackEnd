package core.coordinates.api;

public interface ICoordninate
{
	public double getLongitude();
	
	public double getLatitude();
	
	public double getDistanceTo(ICoordninate coordinate);
}
