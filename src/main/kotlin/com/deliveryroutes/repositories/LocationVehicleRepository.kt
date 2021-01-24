package com.deliveryroutes.repositories

import com.deliveryroutes.models.LocationVehicles
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface LocationVehicleRepository: MongoRepository<LocationVehicles, String>