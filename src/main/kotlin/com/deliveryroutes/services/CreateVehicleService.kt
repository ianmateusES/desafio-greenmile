package com.deliveryroutes.services

import com.deliveryroutes.models.Vehicles
import com.deliveryroutes.repositories.VehiclesRepository
import org.springframework.beans.factory.annotation.Autowired

private interface ICreateVehicleDTO {
  fun execute(vehicle: Vehicles) : Vehicles
}

class CreateVehicleService: ICreateVehicleDTO{
	
	@Autowired
	lateinit var vehiclesRepository: VehiclesRepository
	
	override fun execute(vehicle: Vehicles) : Vehicles {
		val resultVehicle = vehiclesRepository.save(vehicle);
		return resultVehicle
	}
}