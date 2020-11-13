package core.potholes.api;

import core.dimensions.api.IDimensions;

public interface IMeasuredPothole extends IPothole
{
	public IDimensions getDimensions();
}
