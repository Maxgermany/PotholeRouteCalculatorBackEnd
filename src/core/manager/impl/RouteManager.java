package core.manager.impl;

import java.util.HashMap;
import java.util.UUID;

import core.routes.impl.Route;

public class RouteManager
{
	private static HashMap<UUID, Route> uuidToRouteMap = new HashMap<UUID, Route>();;

	public RouteManager()
	{

	}

	public static void addRoute(Route route)
	{
		uuidToRouteMap.put(route.getUUID(), route);
	}

	public static Route getRoute(UUID uuid)
	{
		return uuidToRouteMap.get(uuid);
	}

	public static Route[] getRoutes()
	{
		return uuidToRouteMap.values().toArray(new Route[uuidToRouteMap.values().size()]);
	}
}
