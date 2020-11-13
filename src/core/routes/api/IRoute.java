package core.routes.api;

import core.potholes.api.IPothole;

public interface IRoute
{
	public IPothole[] getPotholes();
}
