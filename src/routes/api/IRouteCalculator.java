package routes.api;

import potholes.api.IPothole;

public interface IRouteCalculator
{
	public IPothole[] calculateAndGetRoute(IPothole[] potholes);
}
