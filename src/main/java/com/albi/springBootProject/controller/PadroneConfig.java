package com.albi.springBootProject.controller;

import com.albi.springBootProject.model.Padrone;
import com.albi.springBootProject.repository.PadroneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PadroneConfig {
    //esempio insert
//
//    @Bean
//    CommandLineRunner commandLineRunner(
//            PadroneRepository padroneRepository){
//        return args -> {
//            Padrone padrone1 = new Padrone();
//            padrone1.setCognome("adsC");
//            padrone1.setNome("adsN");
//
//            padroneRepository.save(padrone1);
//        };
//    }

}
