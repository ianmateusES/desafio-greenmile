package com.deliveryroutes.services

import com.deliveryroutes.models.LocationVehicles
import com.deliveryroutes.repositories.LocationVehicleRepository
import org.springframework.beans.factory.annotation.Autowired

private interface IUpdateLocationVehicleDTO {
  fun execute(locatoinVehicles: LocationVehicles) : LocationVehicles
}

class UpdateLocationVehicleService: IUpdateLocationVehicleDTO {
	
	@Autowired
	lateinit var locationVehicleRepository: LocationVehicleRepository
	
	override fun execute(locatoinVehicles: LocationVehicles) : LocationVehicles {
		val resultLocation = locationVehicleRepository.save(locatoinVehicles);
		return resultLocation
	}
}