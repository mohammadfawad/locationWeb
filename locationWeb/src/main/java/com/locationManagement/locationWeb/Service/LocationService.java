package com.locationManagement.locationWeb.Service;

import java.util.List;

import com.locationManagement.locationWeb.Entity.Location;

public interface LocationService {

	Location saveLocation(Location location);
	Location updateLocation(Location location);
	Location getLocationById(Integer locationId);
	List<Location> getAllLocations();
	List<Object[]> getlocationTypeAndLocationTypeCount();
	List<Location> getLocationsByType(String locationType);
	void deleteLocation(Integer locationId);
}
