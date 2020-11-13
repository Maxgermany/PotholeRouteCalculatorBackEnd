package core.potholes.impl;

import core.coordinates.api.ICoordninate;
import core.dimensions.api.IDimensions;
import core.potholes.api.IMeasuredPothole;
import core.potholes.api.IUnphotographedPothole;

public class UnphotographedMeasuredPothole extends Pothole implements IUnphotographedPothole, IMeasuredPothole
{
	private final IDimensions dimensions;

	public UnphotographedMeasuredPothole(ICoordninate coordinate, IDimensions dimensions)
	{
		super(coordinate);
		this.dimensions = dimensions;
	}

	@Override
	public final IDimensions getDimensions()
	{
		return dimensions;
	}
}
