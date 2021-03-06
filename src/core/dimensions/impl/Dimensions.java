package core.dimensions.impl;

import core.dimensions.api.IDimensions;

public final class Dimensions implements IDimensions
{
	private final double length;
	private final double width;
	private final double depth;

	public Dimensions(double length, double width, double depth)
	{
		this.length = length;
		this.width = width;
		this.depth = depth;
	}

	@Override
	public final double getLength()
	{
		return length;
	}

	@Override
	public final double getWidth()
	{
		return width;
	}

	@Override
	public final double getDepth()
	{
		return depth;
	}

	@Override
	public final double getVolume()
	{
		return length * width * depth;
	}
}
