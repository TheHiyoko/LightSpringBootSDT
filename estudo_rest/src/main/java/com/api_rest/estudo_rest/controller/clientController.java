package com.api_rest.estudo_rest.controller;

import java.util.List;

import com.api_rest.estudo_rest.model.clients;
import com.api_rest.estudo_rest.repositori.clientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class clientController {
    
    @Autowired
    private clientRepository clientRepository;

    @GetMapping
    public List<clients> clientList() {
        return clientRepository.findAll();
       
    }
}
