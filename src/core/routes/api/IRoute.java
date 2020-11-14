package core.routes.api;

import java.util.UUID;

import core.potholes.api.IPothole;

public interface IRoute
{
	public UUID getUUID();
	
	public IPothole[] getPotholes();
}
