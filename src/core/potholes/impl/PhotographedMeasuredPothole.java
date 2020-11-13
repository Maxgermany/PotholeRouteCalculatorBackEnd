package core.potholes.impl;

import core.coordinates.api.ICoordninate;
import core.dimensions.api.IDimensions;
import core.images.api.IImage;
import core.potholes.api.IMeasuredPothole;
import core.potholes.api.IPhotographedPothole;

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
	public final IDimensions getDimensions()
	{
		return dimensions;
	}
}
