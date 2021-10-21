package com.albi.springBootProject.controller;

import com.albi.springBootProject.service.PadroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String getById(@PathVariable("id") long id){
        return padroneService.getById(id);
    }
}
