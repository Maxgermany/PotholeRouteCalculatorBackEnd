package core.potholes.impl;

import core.coordinates.api.ICoordninate;
import core.potholes.api.IMeasuredPothole;
import core.potholes.api.IPothole;
import core.potholes.api.IUnmeasuredPothole;

public class PotholeTools
{
	public static int getIndexOfMaxVolumePothole(IPothole[] potholes)
	{
		int indexOfMaxVolumePothole = 0;
		double maxVolume = 0.0;

		for (int i = 0; i < potholes.length; i++)
		{
			final IPothole p = potholes[i];

			if (p instanceof IUnmeasuredPothole)
				continue;

			IMeasuredPothole measuredPothole = (IMeasuredPothole) p;

			double volume = measuredPothole.getDimensions().getVolume();
			if (volume > maxVolume)
			{
				indexOfMaxVolumePothole = i;
				maxVolume = volume;
			}
		}

		return indexOfMaxVolumePothole;
	}

	public static IPothole getMaxVolumePothole(IPothole[] potholes)
	{
		return potholes[getIndexOfMaxVolumePothole(potholes)];
	}

	public static int getIndexOfClosestPotholeTo(IPothole pothole, IPothole[] potholes)
	{
		final ICoordninate coordinate = pothole.getCoordinate();

		int indexOfClosestPothole = 0;
		double minDistance = Double.MAX_VALUE;
		for (int i = 0; i < potholes.length; i++)
		{
			final IPothole p = potholes[i];

			if (p == pothole || p == null)
				continue;

			double distance = p.getCoordinate().getDistanceTo(coordinate);
			if (distance < minDistance)
			{
				indexOfClosestPothole = i;
				minDistance = distance;
			}
		}

		return indexOfClosestPothole;
	}

	public static IPothole getClosestPotholeTo(IPothole pothole, IPothole[] potholes)
	{
		return potholes[getIndexOfClosestPotholeTo(pothole, potholes)];
	}
}
