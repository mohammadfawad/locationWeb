package com.locationManagement.locationWeb.Controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationManagement.locationWeb.Entity.Location;
import com.locationManagement.locationWeb.Service.LocationService;
import com.locationManagement.locationWeb.Utility.EmailUtility;
import com.locationManagement.locationWeb.Utility.ReportUtility;

@Controller
public class LocationController {
	
	@Autowired
	LocationService locationService;
	@Autowired
	EmailUtility emailutility;
	@Autowired
	ReportUtility ReportUtility; 
	@Autowired
	ServletContext servletContext;

	@RequestMapping("/createLocation")
	public String createLocationPage() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap) {
		String response = "\nSaved Location is :: \n" + this.locationService.saveLocation(location).toString();
		modelMap.addAttribute("response",response);
		this.emailutility.sendEmail("m.mohammadfawad@gmail.com", "Location Saved in database", response);
		return "createLocation";
	}
	
	@RequestMapping("/viewAlllocations")
	public String viewAllRecords(ModelMap modelMap) {
		modelMap.addAttribute("listAllLocations", this.locationService.getAllLocations());
		return "viewAlllocations";
	}
	
	@RequestMapping("/updateLocation")
	public String updateLocation(@RequestParam("locationId") Integer locationId, ModelMap modelMap) {
		modelMap.addAttribute("location", this.locationService.getLocationById(locationId));
		return "updateLocation";
	}
	
	@RequestMapping("saveUpdatedLocation")
	public String saveUpdatedLocation(@ModelAttribute("location")Location location, ModelMap modelMap) {
		this.locationService.updateLocation(location);
		modelMap.addAttribute("listAllLocations",this.locationService.getAllLocations());
		return "viewAlllocations";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("locationId") Integer locationId, ModelMap modelMap) {
		this.locationService.deleteLocation(locationId);
		modelMap.addAttribute("listAllLocations", this.locationService.getAllLocations());
		return "viewAlllocations";
	}
	
	@RequestMapping("/loctionsReport")
	public String viewLocationReport() {
		this.ReportUtility.locationPieChart(this.servletContext.getRealPath("/"), this.locationService.getlocationTypeAndLocationTypeCount());
		return "loctionsReport";		
	}
}
