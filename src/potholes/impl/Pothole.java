package potholes.impl;

import coordinates.api.ICoordninate;
import potholes.api.IPothole;

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
