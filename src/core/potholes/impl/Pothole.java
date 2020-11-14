package core.potholes.impl;

import java.util.UUID;

import core.coordinates.api.ICoordninate;
import core.potholes.api.IPothole;

abstract class Pothole implements IPothole
{
	private final UUID uuid;
	private final ICoordninate coordinate;

	public Pothole(ICoordninate coordinate)
	{
		this.uuid = UUID.randomUUID();
		this.coordinate = coordinate;
	}

	@Override
	public final UUID getUUID()
	{
		return uuid;
	}
	
	@Override
	public final ICoordninate getCoordinate()
	{
		return coordinate;
	}
}
