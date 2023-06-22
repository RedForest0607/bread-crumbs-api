package com.redforest.breadcrumbs.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
data class Bread(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bread_id")
    val breadId: Long? = null,

    @Column(name = "bread_name")
    val breadName: String,

    val price: BigDecimal,

    val description: String,

    @Column(name = "image_url")
    val imageUrl: String,

    @Column(name = "quantity_available")
    val quantityAvailable: Int,

    @Column(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at")
    val updatedAt: LocalDateTime = LocalDateTime.now()
)
