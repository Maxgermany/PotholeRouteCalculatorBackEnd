package core.images.impl;

import core.images.api.IImage;

public class Image implements IImage
{
	private final String url;
	
	public Image(String url)
	{
		this.url = url;
	}
	
	@Override
	public final String getURL()
	{
		return url;
	}
}
