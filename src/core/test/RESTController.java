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
	public RESTController()
	{

	}

	@GetMapping("/route")
	public Route route(@RequestParam(value = "uuid", defaultValue = "0") String uuid)
	{
		return RouteManager.getRoute(UUID.fromString(uuid));
	}
	
	@GetMapping("/routes")
	public Route[] routes(@RequestParam(value = "uuid", defaultValue = "0") String uuid)
	{
		return RouteManager.getRoutes();
	}

	@DeleteMapping("/pothole/{uuid}")
	public void deleteEmployee(@PathVariable String uuid)
	{
		System.out.println(UUID.fromString(uuid));
	}
}