package com.rafaelfilgueiras.backline.api.services;

import java.time.LocalDateTime;

import com.rafaelfilgueiras.backline.api.dto.NovaMovimentacao;
import com.rafaelfilgueiras.backline.api.model.Correntista;
import com.rafaelfilgueiras.backline.api.model.Movimentacao;
import com.rafaelfilgueiras.backline.api.model.MovimentacaoTipo;
import com.rafaelfilgueiras.backline.api.repository.CorrentistaRepository;
import com.rafaelfilgueiras.backline.api.repository.MovimentacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoService {

    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private CorrentistaRepository correntistaRepository;

    public void save(NovaMovimentacao novaMovimentacao){
        Movimentacao movimentacao = new Movimentacao();

        // Ele valida o tipo para determinar se o saldo é negativo ou positivo 
        Double valor = novaMovimentacao.getTipo() == MovimentacaoTipo.RECEITA ? novaMovimentacao.getValor() : novaMovimentacao.getValor() * -1;

        movimentacao.setDataHora(LocalDateTime.now());
        movimentacao.setDescricao(novaMovimentacao.getDescricao());
        movimentacao.setIdConta(novaMovimentacao.getIdConta());
        movimentacao.setTipo(novaMovimentacao.getTipo());
        movimentacao.setValor(valor);

        Correntista correntista = correntistaRepository.findById(novaMovimentacao.getIdConta()).orElse(null);

        if(correntista != null){
            correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
            correntistaRepository.save(correntista);
        }

        repository.save(movimentacao);


    }
}
