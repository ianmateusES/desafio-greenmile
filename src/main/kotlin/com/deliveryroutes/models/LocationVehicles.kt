package com.deliveryroutes.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class LocationVehicles(
		@Id
		val lat: Double,
		val lng: Double,
		val instant: String,
		val vehicleId: Int,
		val createdDate: LocalDateTime = LocalDateTime.now(),
        val modifiedDate: LocalDateTime = LocalDateTime.now()
)