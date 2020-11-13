package potholes.impl;

import coordinates.api.ICoordninate;
import dimensions.api.IDimensions;
import potholes.api.IMeasuredPothole;
import potholes.api.IUnphotographedPothole;

public class UnphotographedMeasuredPothole extends Pothole implements IUnphotographedPothole, IMeasuredPothole
{
	private final IDimensions dimensions;

	public UnphotographedMeasuredPothole(ICoordninate coordinate, IDimensions dimensions)
	{
		super(coordinate);
		this.dimensions = dimensions;
	}

	@Override
	public final IDimensions getDimentsions()
	{
		return dimensions;
	}
}
