package core.routes.impl;

import java.util.ArrayList;

import core.potholes.api.IPothole;
import core.potholes.impl.PotholeTools;
import core.routes.api.IRouteCalculator;

public class GreedyRouteCalculator implements IRouteCalculator
{
	private double estimatedTimePerPothole;
	private double maxWorkingTime;

	public GreedyRouteCalculator(double estimatedTimePerPothole, double maxWorkingTime)
	{
		this.estimatedTimePerPothole = estimatedTimePerPothole;
		this.maxWorkingTime = maxWorkingTime;
	}

	@Override
	public IPothole[] calculateAndGetRoute(IPothole[] potholes)
	{
		ArrayList<IPothole> route = new ArrayList<IPothole>();

		int indexOfMaxVolumePothole = PotholeTools.getIndexOfMaxVolumePothole(potholes);
		route.add(potholes[indexOfMaxVolumePothole]);
		potholes[indexOfMaxVolumePothole] = null;

		double estimatedPassedTime = 0.0;
		while (estimatedPassedTime < maxWorkingTime - estimatedTimePerPothole && route.size()<potholes.length)
		{
			int indexOfClosestPothole = PotholeTools.getIndexOfClosestPotholeTo(route.get(route.size() - 1), potholes);
			route.add(potholes[indexOfClosestPothole]);
			potholes[indexOfClosestPothole] = null;
			estimatedPassedTime += estimatedTimePerPothole;
		}
		IPothole[] routeArray = new IPothole[route.size()];
		return route.toArray(routeArray);
	}

	public double getEstimatedTimePerPothole()
	{
		return estimatedTimePerPothole;
	}

	public double getMaxWorkingTime()
	{
		return maxWorkingTime;
	}
}
