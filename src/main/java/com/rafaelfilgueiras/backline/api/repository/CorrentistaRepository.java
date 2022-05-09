package com.rafaelfilgueiras.backline.api.repository;

import com.rafaelfilgueiras.backline.api.model.Correntista;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer>{
    
}
