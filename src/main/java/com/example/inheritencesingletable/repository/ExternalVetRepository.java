package com.example.inheritencesingletable.repository;

import com.example.inheritencesingletable.domain.ExternalVet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalVetRepository extends JpaRepository<ExternalVet,Integer> {
}
