package com.locationManagement.locationWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locationManagement.locationWeb.Entity.Location;
import com.locationManagement.locationWeb.Service.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationRestController{

	@Autowired
	LocationService locationService;
	
	@GetMapping
	public List<Location> getAllLocations(){
		return this.locationService.getAllLocations();
		
	}
	
	@GetMapping("/{locationId}")
	public Location getOneLocation(@PathVariable("locationId") Integer locationId){ 
		return this.locationService.getLocationById(locationId);
	}
	
	@PostMapping
	public Location createLocation(@RequestBody Location location) {
		return this.locationService.saveLocation(location);
	}
	
	@PutMapping
	public Location updateLocation(@RequestBody Location location) {
		return this.locationService.updateLocation(location);
	}
	
	@DeleteMapping("/{locationId}")
	public void deleteLocation(@PathVariable("locationId") Integer locationId) {
		this.locationService.deleteLocation(locationId);
	}
	
}
