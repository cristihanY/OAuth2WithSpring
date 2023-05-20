package com.oauth2.authorizationserver.repository;

import com.oauth2.authorizationserver.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    Optional<Client>  findByClientId (String clientId);
}
