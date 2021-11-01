package com.kevinvilla.prueba.repository

import com.kevinvilla.prueba.model.Client
import com.kevinvilla.prueba.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Long> {
    fun findById(id: Long?): Product?
}