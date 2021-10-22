package com.albi.springBootProject.service;

import com.albi.springBootProject.model.Padrone;
import com.albi.springBootProject.repository.PadroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    public void getPadroneByCognome(String cognome){
        Optional<Padrone> padroneByCognome =
                padroneRepository.findPadroneByCognome(cognome);
        System.out.println(padroneByCognome.toString());
    }

    public void deleteStudent(int padroneId) {
        if(!padroneRepository.existsById(padroneId)){
            throw new IllegalStateException("Nessun padronce con id: "+ padroneId);
        } else padroneRepository.deleteById(padroneId);
    }

    //managed state
    @Transactional
    public void updatePadrone(int padroneId,
                              Padrone padrone) {
        //findbyid
        Padrone padrone1 = padroneRepository
                .findById(padroneId)
                .orElseThrow(()-> new IllegalStateException(
                        "Nessun Padrone con id: " + padroneId));

        if(padrone.getNome() != null &&
                padrone.getNome().length()>0 &&
                !padrone1.getNome().equals(padrone.getNome())){

            padrone1.setNome(padrone.getNome());
        }

        if(padrone.getCognome() != null &&
                padrone.getCognome().length()>0 &&
                !padrone1.getCognome().equals(padrone.getCognome())){

            padrone1.setCognome(padrone.getCognome());
        }
    }
}
