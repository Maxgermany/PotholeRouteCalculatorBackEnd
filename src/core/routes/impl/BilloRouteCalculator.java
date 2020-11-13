package core.routes.impl;

import java.util.Arrays;
import java.util.Comparator;

import core.potholes.api.IMeasuredPothole;
import core.potholes.api.IPothole;
import core.potholes.api.IUnmeasuredPothole;
import core.routes.api.IRouteCalculator;

public class BilloRouteCalculator implements IRouteCalculator
{
	@Override
	public IPothole[] calculateAndGetRoute(IPothole[] potholes)
	{
		IPothole[] potholesCopy = Arrays.copyOf(potholes, potholes.length);
		Arrays.sort(potholesCopy, new Comparator<IPothole>()
		{
			@Override
			public int compare(IPothole o1, IPothole o2)
			{
				if (o1 instanceof IUnmeasuredPothole)
					return 1;

				if (o2 instanceof IUnmeasuredPothole)
					return -1;

				IMeasuredPothole measuredPothole1 = (IMeasuredPothole) o1;
				IMeasuredPothole measuredPothole2 = (IMeasuredPothole) o2;

				if (measuredPothole1.getDimensions().getVolume() < measuredPothole2.getDimensions().getVolume())
					return 1;
				else
					return 0;
			}
		});
		return potholesCopy;
	}
}
