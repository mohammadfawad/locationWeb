package com.locationManagement.locationWeb.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationManagement.locationWeb.Entity.Location;
import com.locationManagement.locationWeb.Repository.LocationRepository;

@Service
public class LocationServiceImplementation implements LocationService {

	@Autowired
	LocationRepository locationRepository;
	
	@Override
	public Location saveLocation(Location location) {
		// TODO Auto-generated method stub
		return this.locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		// TODO Auto-generated method stub
		return this.locationRepository.save(location);
	}

	@Override
	public Location getLocationById(Integer locationId) {
		// TODO Auto-generated method stub
		return (Location) this.locationRepository.getById(locationId);
	}

	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return this.locationRepository.findAll();
	}

	@Override
	public void deleteLocation(Integer locationId) {
		// TODO Auto-generated method stub
		this.locationRepository.deleteById(locationId);
	}

	@Override
	public List<Location> getLocationsByType(String locationType) {
		// TODO Auto-generated method stub
		return locationRepository.findByLocationType(locationType);
	}
	
	@Override
	public List<Object[]> getlocationTypeAndLocationTypeCount() {
		// TODO Auto-generated method stub
		return locationRepository.findlocationTypeAndLocationTypeCount();
	}

}
