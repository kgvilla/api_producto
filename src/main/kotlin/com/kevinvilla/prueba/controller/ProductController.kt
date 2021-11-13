package com.kevinvilla.prueba.controller

import com.kevinvilla.prueba.model.Client
import com.kevinvilla.prueba.model.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import com.kevinvilla.prueba.service.ProductService

@RestController
@RequestMapping("/product")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ProductController {
    @Autowired
    lateinit var productService: ProductService

    @GetMapping
    fun list(): List<Product>{
        return productService.list()
    }

    @PostMapping
    fun save (@RequestBody product : Product):Product {
        return productService.save(product)

    }

    @PutMapping
    fun update (@RequestBody product: Product): Product {
        return productService.update(product)
    }

    @PatchMapping
    fun updateDescription (@RequestBody product : Product):Product{
        return productService.updateDescription(product)
    }

    @DeleteMapping ("/delete/{id}")
    fun  delete (@PathVariable ( "id" ) id: Long ): Boolean {
        return productService.delete (id)
    }

}
