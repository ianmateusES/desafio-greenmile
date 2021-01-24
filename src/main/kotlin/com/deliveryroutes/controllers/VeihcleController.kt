package com.deliveryroutes.controllers

import com.deliveryroutes.models.Vehicles

import com.deliveryroutes.services.CreateVehicleService

import org.springframework.web.bind.annotation.RestController
import org.springframework.http.ResponseEntity
import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.*

import com.google.gson.Gson;

@RestController
@Api(value = "vehicle", description = "vehicle API")
@RequestMapping(value=["/vehicle"])
class VeihcleController {

	private val gson = Gson();
	private val createVehicleService = CreateVehicleService();
	
	@PostMapping("/")
	fun create(@RequestBody reqbody: String): ResponseEntity<Vehicles> {
		val vehicles = gson.fromJson(reqbody, Vehicles::class.java);
		return ResponseEntity.ok(createVehicleService.execute(vehicles));
	}
}
