// Consulting/accessing the database (using JPA, i.e. Java's ORM)
package com.example.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
