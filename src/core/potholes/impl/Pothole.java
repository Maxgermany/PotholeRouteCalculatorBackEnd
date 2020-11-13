package core.potholes.impl;

import core.coordinates.api.ICoordninate;
import core.potholes.api.IPothole;

abstract class Pothole implements IPothole
{
	private final ICoordninate coordinate;

	public Pothole(ICoordninate coordinate)
	{
		this.coordinate = coordinate;
	}

	@Override
	public final ICoordninate getCoordinate()
	{
		return coordinate;
	}
}
