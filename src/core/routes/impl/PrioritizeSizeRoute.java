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

				return measuredPothole1.getDimensions().getVolume() - measuredPothole2.getDimensions().getVolume();

			}
		});

		ArrayList<IPothole> route  = new ArrayList<IPothole>();
		
		route.add(potholesCopy[0]);
		maxWorkingTime -= estimatedTimePerPothole;

		for(int i = 1; i < potholesCopy.length; i++){
			double diffLat = Math.abs(route.get(route.size() -1 ).getCoordinate().getLatitude() - potholesCopy[i].getCoordinate().getLatitude());
			double diffLng = Math.abs(route.get(route.size() -1 ).getCoordinate().getLongitude() - potholesCopy[i].getCoordinate().getLongitude());
			
			if(diffLat < 0.05 & diffLng < 0.05 & maxWorkingTime > estimatedTimePerPothole){
				route.add(potholes[i]);
				maxWorkingTime -= estimatedTimePerPothole;
			}else if(maxWorkingTime < estimatedTimePerPothole){
				break;
			}
		}
		IPothole[] routeArray = new IPothole[route.size()];
		return route.toArray(routeArray);
	}
}
