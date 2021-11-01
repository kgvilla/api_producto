package com.kevinvilla.prueba.model

import javax.persistence.*

@Entity
@Table(name = "client")
class Client{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var name: String? = null
    var apellido: String? = null
    var description: String? = null
    var precio: String? = null

}