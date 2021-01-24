package com.deliveryroutes.services

import com.deliveryroutes.models.DeliveryRoutes
import com.deliveryroutes.repositories.DeliveryRoutesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

interface CreateDeliveryDTO {
  fun execute(delivery: DeliveryRoutes) : DeliveryRoutes
}

@Service("deliveryRouteService")
class CreateDeliveryRouteService: CreateDeliveryDTO {
	
	@Autowired
	lateinit var deliveryRoutesRepository: DeliveryRoutesRepository
	
	override fun execute(delivery: DeliveryRoutes) : DeliveryRoutes {
		val resultDelivery = deliveryRoutesRepository.save(delivery)
		return resultDelivery
	}
}