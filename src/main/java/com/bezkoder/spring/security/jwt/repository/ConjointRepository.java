package com.bezkoder.spring.security.jwt.repository;


import com.bezkoder.spring.security.jwt.models.demo.Conjoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConjointRepository  extends JpaRepository<Conjoint, Long> {

}
