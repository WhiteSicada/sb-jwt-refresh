package com.bezkoder.spring.security.jwt.repository;

import java.util.Optional;

import com.bezkoder.spring.security.jwt.models.demo.Enfant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnfantRepository extends JpaRepository<Enfant, Long> {
    Page<Enfant> findByClientId(Long clientId, Pageable pageable);
    Optional<Enfant> findByIdAndClientId(Long id, Long clientId);
}