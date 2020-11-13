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

	@Override
	public double getDistanceTo(ICoordninate coordinate)
	{
		double R = 6371e3;
		double k1 = latitude * Math.PI / 180;
		double k2 = coordinate.getLatitude() * Math.PI / 180;
		double dk = (coordinate.getLatitude() - latitude) * Math.PI / 180;
		double dl = (coordinate.getLongitude() - longitude) * Math.PI / 180;

		double a = Math.sin(dk / 2) * Math.sin(dk / 2)
				+ Math.cos(k1) * Math.cos(k2) * Math.sin(dl / 2) * Math.sin(dl / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		double d = R * c;

		return d;
	}
}
