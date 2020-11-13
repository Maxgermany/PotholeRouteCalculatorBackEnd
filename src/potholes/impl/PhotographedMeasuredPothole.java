package potholes.impl;

import coordinates.api.ICoordninate;
import dimensions.api.IDimensions;
import images.api.IImage;
import potholes.api.IMeasuredPothole;
import potholes.api.IPhotographedPothole;

public class PhotographedMeasuredPothole extends Pothole implements IPhotographedPothole, IMeasuredPothole
{
	private final IImage image;
	private final IDimensions dimensions;

	public PhotographedMeasuredPothole(ICoordninate coordinate, IImage image, IDimensions dimensions)
	{
		super(coordinate);
		this.image = image;
		this.dimensions = dimensions;
	}

	@Override
	public final IImage getImage()
	{
		return image;
	}

	@Override
	public final IDimensions getDimentsions()
	{
		return dimensions;
	}
}
