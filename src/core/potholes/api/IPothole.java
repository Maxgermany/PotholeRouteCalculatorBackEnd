package core.potholes.api;

import java.util.UUID;

import core.coordinates.api.ICoordninate;

public interface IPothole
{
	public UUID getUUID();
	
	public ICoordninate getCoordinate();
}
