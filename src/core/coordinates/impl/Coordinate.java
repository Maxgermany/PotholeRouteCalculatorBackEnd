package core.coordinates.impl;

import core.coordinates.api.ICoordninate;

public final class Coordinate implements ICoordninate
{
	public final double longitude;
	public final double latitude;

	public Coordinate(double longitude, double latitude)
	{
		this.longitude = longitude;
		this.latitude = latitude;
	}

	@Override
	public final double getLongitude()
	{
		return longitude;
	}

	@Override
	public final double getLatitude()
	{
		return latitude;
	}
}
