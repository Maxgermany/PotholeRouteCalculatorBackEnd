package core.manager.impl;

import java.util.HashMap;

import core.routes.impl.BilloRouteCalculator;
import core.routes.impl.Route;

public class RouteManager
{
	private HashMap<UUID, Route> idToRouteMap;

	public RouteManager()
	{
		this.idToRouteMap = new HashMap<Integer, Route>();
	}

	public Route getRoute()
	{
		Route route = new Route(null, new BilloRouteCalculator());
		idToRouteMap.put(id, route);
		id++;
		return route;
	}
}
