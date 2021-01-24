package com.deliveryroutes.repositories

import com.deliveryroutes.models.DeliveryRoutes
import org.bson.types.ObjectId
import org.springframework.data.repository.CrudRepository

interface DeliveryRoutesRepository: CrudRepository<DeliveryRoutes, String>