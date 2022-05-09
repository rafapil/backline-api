package com.rafaelfilgueiras.backline.api.services;

import java.util.Date;

import com.rafaelfilgueiras.backline.api.dto.NovoCorrentista;
import com.rafaelfilgueiras.backline.api.model.Conta;
import com.rafaelfilgueiras.backline.api.model.Correntista;
import com.rafaelfilgueiras.backline.api.repository.CorrentistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorrentistaService {

    @Autowired
    private CorrentistaRepository repository;

    public void save(NovoCorrentista novoCorrentista) {

        Correntista correntista = new Correntista();
        correntista.setCpf(novoCorrentista.getCpf());
        correntista.setNome(novoCorrentista.getNome());

        Conta conta = new Conta();
        conta.setSaldo(0.0);
        conta.setNumero(new Date().getTime());

        correntista.setConta(conta);
        repository.save(correntista);

    }
}
