package com.kevinvilla.prueba.controller

import com.kevinvilla.prueba.model.Client
import com.kevinvilla.prueba.model.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import com.kevinvilla.prueba.service.ClientService

@RestController
@RequestMapping("/client")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ClientController {
    @Autowired
    lateinit var clientService: ClientService

    @GetMapping
    fun list(): List<Client>{
        return clientService.list()
    }

    @PostMapping
    fun save (@RequestBody client: Client): Client {
        return clientService.save(client)

    }

    @PutMapping
    fun update (@RequestBody client: Client): Client{
        return clientService.update(client)
    }

    @PatchMapping
    fun updateDescription (@RequestBody client: Client): Client{
        return clientService.updateDescription(client)
    }

    @DeleteMapping ("/delete/{id}")
    fun  delete (@PathVariable ( "id" ) id: Long ): Boolean {
        return clientService.delete (id)
    }

}