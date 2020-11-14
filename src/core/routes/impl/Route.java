package core.routes.impl;

import java.util.Arrays;
import java.util.UUID;

import core.potholes.api.IPothole;
import core.routes.api.IRoute;
import core.routes.api.IRouteCalculator;

public class Route implements IRoute
{
	private final UUID uuid;
	private final IPothole[] potholes;

	public Route(IPothole[] potholes, IRouteCalculator routeCalculator)
	{
		this.uuid = UUID.randomUUID();
		this.potholes = routeCalculator.calculateAndGetRoute(potholes);
	}
	
	@Override
	public final UUID getUUID()
	{
		return uuid;
	}

	@Override
	public IPothole[] getPotholes()
	{
		return Arrays.copyOf(potholes, potholes.length);
	}
}
