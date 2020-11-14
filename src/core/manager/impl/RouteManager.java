package core.manager.impl;

import java.util.HashMap;

import core.routes.impl.BilloRouteCalculator;
import core.routes.impl.Route;

public class RouteManager
{
	private int id;
	private HashMap<Integer, Route> idToRouteMap;

	public RouteManager()
	{
		this.id = 0;
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
