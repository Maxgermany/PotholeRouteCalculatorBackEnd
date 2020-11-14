package core.routes.impl;

import java.util.ArrayList;
import java.util.Arrays;

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
		IPothole[] potholesCopy = Arrays.copyOf(potholes, potholes.length);
		ArrayList<IPothole> route = new ArrayList<IPothole>();

		int indexOfMaxVolumePothole = PotholeTools.getIndexOfMaxVolumePothole(potholesCopy);
		route.add(potholesCopy[indexOfMaxVolumePothole]);
		potholesCopy[indexOfMaxVolumePothole] = null;

		double estimatedPassedTime = 0.0;
		while (estimatedPassedTime < maxWorkingTime - estimatedTimePerPothole && route.size() < potholesCopy.length)
		{
			int indexOfClosestPothole = PotholeTools.getIndexOfClosestPotholeTo(route.get(route.size() - 1),
					potholesCopy);
			route.add(potholesCopy[indexOfClosestPothole]);
			potholesCopy[indexOfClosestPothole] = null;
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
