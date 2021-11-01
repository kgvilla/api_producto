package com.kevinvilla.prueba.model

import javax.persistence.*

@Entity
@Table(name = "product")
class Product{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null



    var description: String? = null
    var details: String? = null
    var precio: String? = null

}