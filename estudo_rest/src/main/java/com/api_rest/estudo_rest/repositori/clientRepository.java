    package com.api_rest.estudo_rest.repositori;

import com.api_rest.estudo_rest.model.clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepository extends JpaRepository<clients, Long> {
    
}
