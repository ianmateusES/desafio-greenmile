package com.deliveryroutes.repositories

import com.deliveryroutes.models.Vehicles
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface VehiclesRepository: MongoRepository<Vehicles, String>