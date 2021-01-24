package com.deliveryroutes.models

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias
import java.time.LocalDateTime

@TypeAlias("deliveryRoutes")
data class DeliveryRoutes(
		@Id
		val assignedVehicle: Int,
		val routePlan: String,
		val plannedStops: List<DeliveryPlace>,
		val status: String = "Pendente",
		val createdDate: LocalDateTime = LocalDateTime.now(),
        val modifiedDate: LocalDateTime = LocalDateTime.now()
)