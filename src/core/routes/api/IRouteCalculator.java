package core.routes.api;

import core.potholes.api.IPothole;

public interface IRouteCalculator
{
	public IPothole[] calculateAndGetRoute(IPothole[] potholes);
}
