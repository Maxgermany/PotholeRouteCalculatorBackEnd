package potholes.impl;

import coordinates.api.ICoordninate;
import images.api.IImage;
import potholes.api.IPhotographedPothole;
import potholes.api.IUnmeasuredPothole;

public class PhotographedUnmeasuredPothole extends Pothole implements IPhotographedPothole, IUnmeasuredPothole
{
	private final IImage image;

	public PhotographedUnmeasuredPothole(ICoordninate coordinate, IImage image)
	{
		super(coordinate);
		this.image = image;
	}

	@Override
	public final IImage getImage()
	{
		return image;
	}
}
