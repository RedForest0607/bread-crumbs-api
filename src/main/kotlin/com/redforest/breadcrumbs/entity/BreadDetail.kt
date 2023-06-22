package com.redforest.breadcrumbs.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "bread_detail")
data class BreadDetail(
    @Id
    @Column(name = "bread_id")
    val breadId: Long,

    val ingredients: String,

    @Column(name = "nutrition_facts")
    val nutritionFacts: String,

    @Column(name = "allergen_info")
    val allergenInfo: String,

    @Column(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at")
    val updatedAt: LocalDateTime = LocalDateTime.now(),

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "bread_id")
    val bread: Bread
)