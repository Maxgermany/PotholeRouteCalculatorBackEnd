package core.manager.impl;

import java.util.HashMap;
import java.util.UUID;

import core.routes.impl.Route;

public class RouteManager
{
	private HashMap<UUID, Route> uuidToRouteMap;

	public RouteManager()
	{
		this.uuidToRouteMap = new HashMap<UUID, Route>();
	}

	public void addRoute(Route route)
	{
		uuidToRouteMap.put(route.getUUID(), route);
	}
	
	public Route getRoute(UUID uuid)
	{
		return uuidToRouteMap.get(uuid);
	}
}
