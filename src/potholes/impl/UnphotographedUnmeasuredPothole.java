package potholes.impl;

import coordinates.api.ICoordninate;
import potholes.api.IUnmeasuredPothole;
import potholes.api.IUnphotographedPothole;

public class UnphotographedUnmeasuredPothole extends Pothole implements IUnphotographedPothole, IUnmeasuredPothole
{
	public UnphotographedUnmeasuredPothole(ICoordninate coordinate)
	{
		super(coordinate);
		// TODO Auto-generated constructor stub
	}
}
