package core.routes.impl;

import core.potholes.api.IPothole;
import core.potholes.impl.PotholeTools;
import core.routes.api.IRouteCalculator;

public class TempRouteCalculator implements IRouteCalculator
{
	private double estimatedTimePerPothole;
	private double maxWorkingTime;

	public TempRouteCalculator(double estimatedTimePerPothole, double maxWorkingTime)
	{
		this.estimatedTimePerPothole = estimatedTimePerPothole;
		this.maxWorkingTime = maxWorkingTime;
	}

	@Override
	public IPothole[] calculateAndGetRoute(IPothole[] potholes)
	{
		int indexOfMaxVolumePothole = PotholeTools.getIndexOfMaxVolumePothole(potholes);

		return null;
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
