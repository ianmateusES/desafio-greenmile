package com.deliveryroutes.controller

import com.deliveryroutes.models.DeliveryRoutes

import com.deliveryroutes.services.CreateDeliveryRouteService

import org.springframework.web.bind.annotation.RestController
import org.springframework.http.ResponseEntity
import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

import com.google.gson.Gson;

@RestController
@Api(value = "deliveryroutes", description = "DeliveryRoutes API")
@RequestMapping(value=["/deliveryroutes"])
class DeliveryRoutesController {
	
	@Autowired
	lateinit var createDeliveryRouteService: CreateDeliveryRouteService;
	
	private val gson = Gson();
	
	
	@PostMapping("/")
	fun create(@RequestBody reqbody: String): ResponseEntity<DeliveryRoutes> {
		val delivery = gson.fromJson(reqbody, DeliveryRoutes::class.java);
		return ResponseEntity.ok(createDeliveryRouteService.execute(delivery));
	}
	
	@GetMapping("/")
	fun show(): ResponseEntity<String> {
		return ResponseEntity.ok("Okay1")
	}
}