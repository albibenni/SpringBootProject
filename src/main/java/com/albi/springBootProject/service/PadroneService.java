package com.albi.springBootProject.service;

import com.albi.springBootProject.model.Padrone;
import com.albi.springBootProject.repository.PadroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PadroneService {

    private final PadroneRepository padroneRepository;

    @Autowired
    public PadroneService(PadroneRepository padroneRepository) {
        this.padroneRepository = padroneRepository;
    }

    public String hello(){
        return "Hello World";
    }

    public String helloProva(){
        return "Hello Prova";
    }

    public String getById(int id){
        return padroneRepository.getById(id).toString();
    }

    public List<Padrone> getPadroni(){
        return padroneRepository.findAll();
    }

    public void postPadrone(Padrone padrone) {
        padroneRepository.save(padrone);
    }
}
