package core.routes.impl;

import java.util.Arrays;

import core.potholes.api.IPothole;
import core.routes.api.IRoute;
import core.routes.api.IRouteCalculator;

public class Route implements IRoute
{
	private final IPothole[] potholes;

	public Route(IPothole[] potholes, IRouteCalculator routeCalculator)
	{
		this.potholes = routeCalculator.calculateAndGetRoute(potholes);
	}

	@Override
	public IPothole[] getPotholes()
	{
		return Arrays.copyOf(potholes, potholes.length);
	}
}
