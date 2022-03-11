package com.api_rest.estudo_rest.controller;

import java.util.List;

import com.api_rest.estudo_rest.model.clients;
import com.api_rest.estudo_rest.repositori.clientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class clientController {
    
    @Autowired 
    //pesquisar sobre autowride
    private clientRepository clientRepository;
    
    //usa uma lista pra mostrar os users
    @GetMapping
    public List<clients> clientList() {
        return clientRepository.findAll();
    }

    //RequestBody mapea o json para o molde do cliente
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public clients add(@RequestBody clients clients){
        return clientRepository.save(clients);
    }
}
