package potholes.api;

import images.api.IImage;

public interface IPhotographedPothole extends IPothole
{
	public IImage getImage();
}
