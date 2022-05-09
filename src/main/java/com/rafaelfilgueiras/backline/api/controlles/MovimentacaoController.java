package com.rafaelfilgueiras.backline.api.controlles;

import java.util.List;

import com.rafaelfilgueiras.backline.api.dto.NovaMovimentacao;
import com.rafaelfilgueiras.backline.api.dto.NovoCorrentista;
// import com.rafaelfilgueiras.backline.api.model.Correntista;
import com.rafaelfilgueiras.backline.api.model.Movimentacao;
// import com.rafaelfilgueiras.backline.api.repository.CorrentistaRepository;
import com.rafaelfilgueiras.backline.api.repository.MovimentacaoRepository;
import com.rafaelfilgueiras.backline.api.services.CorrentistaService;
import com.rafaelfilgueiras.backline.api.services.MovimentacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovaMovimentacao novaMovimentacao){
        service.save(novaMovimentacao);
    }


}
