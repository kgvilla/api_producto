package com.kevinvilla.prueba.service


import com.kevinvilla.prueba.model.Client

import com.kevinvilla.prueba.model.Product
import com.kevinvilla.prueba.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Service
class ProductService {
    @Autowired
    lateinit var productRepository: ProductRepository


    fun list(): List<Product> {

        return productRepository.findAll()
    }

    @PostMapping
    fun save (@RequestBody product: Product):Product{

        return productRepository.save(product)
    }

    fun update(product: Product): Product {
        return productRepository.save(product)
    }

    fun updateDescription(product: Product):Product {
        val response = productRepository.findById(product.id) ?: throw Exception()
        response.apply {
            this.description=product.description
        }
        return productRepository.save(response)
    }

    fun  delete ( id : Long ): Boolean {
        productRepository.deleteById (id)
        return  true
    }
}