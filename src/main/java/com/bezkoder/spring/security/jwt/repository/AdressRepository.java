package com.bezkoder.spring.security.jwt.repository;

import com.bezkoder.spring.security.jwt.models.demo.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Long> {

}
