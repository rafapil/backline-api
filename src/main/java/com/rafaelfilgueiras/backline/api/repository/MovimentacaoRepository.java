package com.rafaelfilgueiras.backline.api.repository;

import com.rafaelfilgueiras.backline.api.model.Movimentacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{
    
}
