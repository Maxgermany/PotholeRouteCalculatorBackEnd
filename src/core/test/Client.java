package core.test;

import core.manager.impl.RouteManager;
import core.routes.impl.BilloRouteCalculator;
import core.routes.impl.GreedyRouteCalculator;
import core.routes.impl.PrioritizeBySizeRouteCalculator;
import core.routes.impl.Route;

public class Client
{
	private RouteManager routeManager;

	public Client()
	{
		this.routeManager = new RouteManager();

		Route route1 = new Route(DummyData.potholes, new BilloRouteCalculator());
		Route route2 = new Route(DummyData.potholes, new GreedyRouteCalculator(40, 250));
		Route route3 = new Route(DummyData.potholes, new PrioritizeBySizeRouteCalculator(40, 250));

		routeManager.addRoute(route1);
		routeManager.addRoute(route2);
		routeManager.addRoute(route3);
	}

	public static void main(String[] args)
	{

	}
}
