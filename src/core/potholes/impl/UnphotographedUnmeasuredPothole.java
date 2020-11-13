package core.potholes.impl;

import core.coordinates.api.ICoordninate;
import core.potholes.api.IUnmeasuredPothole;
import core.potholes.api.IUnphotographedPothole;

public class UnphotographedUnmeasuredPothole extends Pothole implements IUnphotographedPothole, IUnmeasuredPothole
{
	public UnphotographedUnmeasuredPothole(ICoordninate coordinate)
	{
		super(coordinate);
		// TODO Auto-generated constructor stub
	}
}
