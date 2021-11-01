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

    fun update(client: Client):Client{
    return clientRepository.save(client)
    }

    fun updateDescription(client: Client):Client{
        val response = clientRepository.findById(client.id) ?: throw Exception()
        response.apply {
            this.description=client.description
        }
        return clientRepository.save(response)
    }

    fun  delete ( id : Long ): Boolean {
        clientRepository.deleteById (id)
        return  true
    }

}
