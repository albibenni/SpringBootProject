package com.albi.springBootProject.repository;

import com.albi.springBootProject.model.Padrone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PadroneRepository
        extends JpaRepository<Padrone, Integer> {

    @Query("SELECT p FROM Padrone p WHERE p.cognome = ?1")
    Optional<Padrone> findPadroneByCognome(String cognome);

}
