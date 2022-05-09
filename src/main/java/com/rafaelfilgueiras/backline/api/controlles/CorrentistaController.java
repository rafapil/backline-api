package com.rafaelfilgueiras.backline.api.controlles;

import java.util.List;

import com.rafaelfilgueiras.backline.api.dto.NovoCorrentista;
import com.rafaelfilgueiras.backline.api.model.Correntista;
import com.rafaelfilgueiras.backline.api.repository.CorrentistaRepository;
import com.rafaelfilgueiras.backline.api.services.CorrentistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository repository;

    @Autowired
    private CorrentistaService service;

    @GetMapping
    public List<Correntista> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovoCorrentista correntista){
        service.save(correntista);
    }


}
