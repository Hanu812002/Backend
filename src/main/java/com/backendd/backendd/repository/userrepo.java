package com.backendd.backendd.repository;
import org.springframework.data.repository.CrudRepository;
// import org.springframework.stereotype.Repository;

import com.backendd.backendd.entities.User;

public interface userrepo extends CrudRepository<User,Integer> {

    org.springframework.boot.autoconfigure.security.SecurityProperties.User save(
            org.springframework.boot.autoconfigure.security.SecurityProperties.User u);
    
}
