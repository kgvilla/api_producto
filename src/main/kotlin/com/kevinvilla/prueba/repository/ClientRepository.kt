package com.kevinvilla.prueba.repository

import com.kevinvilla.prueba.model.Client

import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository:JpaRepository <Client, Long> {

    fun findById(id: Long?): Client?

}