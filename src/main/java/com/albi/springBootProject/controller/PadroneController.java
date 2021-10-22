package com.albi.springBootProject.controller;

import com.albi.springBootProject.model.Padrone;
import com.albi.springBootProject.service.PadroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("api/padrone")
public class PadroneController {

    private final PadroneService padroneService;

    @Autowired
    public PadroneController(PadroneService padroneService) {
        this.padroneService = padroneService;
    }

    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @GetMapping("prova")
    public String helloProva(){
        return "Hello Prova";
    }

    @GetMapping("get/{id}")
    public String getById(@PathVariable("id") int id){
        return padroneService.getById(id);
    }
    @GetMapping("getAll")
    public List<Padrone> getPadroni() {
        return padroneService.getPadroni();
    }
    @PostMapping("insert")
    public void postPadrone(@RequestBody Padrone padrone){
        padroneService.postPadrone(padrone);
    }

    @GetMapping("byCognome/{cognome}")
    public void getPadroneByCognome(@PathVariable("cognome") String cognome){
        padroneService.getPadroneByCognome(cognome);
    }

    @PutMapping("update/{padroneId}")
    public void updatePadrone(
            @RequestBody Padrone padrone,
            @PathVariable("padroneId") int padroneId
    ){
        padroneService.updatePadrone(padroneId, padrone);
    }

    @DeleteMapping("delete/{padroneId}")
    public void deleteStudent(@PathVariable("padroneId") int id){
        padroneService.deleteStudent(id);
    }
}
