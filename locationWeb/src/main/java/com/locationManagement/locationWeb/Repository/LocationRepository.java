/**
 * 
 */
package com.locationManagement.locationWeb.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.locationManagement.locationWeb.Entity.Location;

/**
 * @author spring
 *
 */
@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

	//Custom Finder Methods
	List<Location> findByLocationId(Integer locationId);
	List<Location> findByLocationTypeAndLocationName(String locationType, String locationName);
	List<Location> findByLocationType(String locationType);
	@Query("SELECT locationType, COUNT(locationType) FROM Location GROUP BY locationType") //JPQL
	List<Object[]> findlocationTypeAndLocationTypeCount();
	
	
	
}
