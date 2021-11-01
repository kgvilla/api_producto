package com.kevinvilla.prueba.service


import com.kevinvilla.prueba.model.Client
import com.kevinvilla.prueba.model.Product
import com.kevinvilla.prueba.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Service
class ClientService {
    @Autowired
    lateinit var clientRepository: ClientRepository


    fun list(): List<Client> {

        return clientRepository.findAll()
    }

    @PostMapping
    fun save (@RequestBody client: Client): Client {

        return clientRepository.save(client)
    }
}
