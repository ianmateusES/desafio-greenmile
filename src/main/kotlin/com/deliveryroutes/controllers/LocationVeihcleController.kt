package com.deliveryroutes.controllers

import com.deliveryroutes.models.LocationVehicles

import com.deliveryroutes.services.UpdateLocationVehicleService

import org.springframework.web.bind.annotation.RestController
import org.springframework.http.ResponseEntity
import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.*

import com.google.gson.Gson;

@RestController
@Api(value = "locationveihcle", description = "LocationVeihcle API")
@RequestMapping(value=["/receiveCoordinate"])
class LocationVeihcleController {

	private val gson = Gson();
	private val updateLocationVehicleService = UpdateLocationVehicleService();
	
	@PostMapping("/")
	fun create(@RequestBody reqbody: String): ResponseEntity<Any> {
		val locationVehicles = gson.fromJson(reqbody, LocationVehicles::class.java);
		return ResponseEntity.ok(updateLocationVehicleService.execute(locationVehicles));
	}
}