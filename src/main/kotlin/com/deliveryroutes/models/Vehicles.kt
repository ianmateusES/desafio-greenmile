package com.deliveryroutes.models

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.annotation.Id
import java.time.LocalDateTime

@Document
data class Vehicles(
		@Id
		val id: String,
		val name: String,
		val createdDate: LocalDateTime = LocalDateTime.now(),
        val modifiedDate: LocalDateTime = LocalDateTime.now()
)