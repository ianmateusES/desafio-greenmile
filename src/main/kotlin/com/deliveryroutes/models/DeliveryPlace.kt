package com.deliveryroutes.models

data class DeliveryPlace(
		val lat: Double,
		val lng: Double,
		val description: String,
		val deliveryRadius: Int,
		val delivered: Boolean = false
)