package core.test;

import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import core.manager.impl.RouteManager;
import core.routes.impl.Route;

@RestController
public class RESTController
{
	private final RouteManager routeManater;
	
	public RESTController(RouteManager routeManager)
	{
		this.routeManater = routeManager;
	}
	
	@GetMapping("/route")
	public Route route(@RequestParam(value = "id", defaultValue = "0") UUID uuid)
	{
		return routeManater.getRoute(uuid);
	}

	@DeleteMapping("/pothole/{uuid}")
	public void deleteEmployee(@PathVariable UUID uuid)
	{
		System.out.println(uuid);
	}
}
