package test;

import core.manager.impl.RouteManager;
import core.routes.impl.BilloRouteCalculator;
import core.routes.impl.GreedyRouteCalculator;
import core.routes.impl.PrioritizeBySizeRouteCalculator;
import core.routes.impl.Route;

public class Client
{
	public Client()
	{
		Route route1 = new Route(DummyData.potholes, new BilloRouteCalculator());
		Route route2 = new Route(DummyData.potholes, new GreedyRouteCalculator(40, 250));
		Route route3 = new Route(DummyData.potholes, new PrioritizeBySizeRouteCalculator(40, 250));

		RouteManager.addRoute(route1);
		RouteManager.addRoute(route2);
		RouteManager.addRoute(route3);

		System.out.println(route1.getUUID());
		System.out.println(route2.getUUID());
		System.out.println(route3.getUUID());
	}
}
