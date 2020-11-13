package core.potholes.impl;

import core.coordinates.api.ICoordninate;
import core.images.api.IImage;
import core.potholes.api.IPhotographedPothole;
import core.potholes.api.IUnmeasuredPothole;

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
