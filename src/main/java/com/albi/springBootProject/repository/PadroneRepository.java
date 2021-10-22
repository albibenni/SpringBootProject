package com.albi.springBootProject.repository;

import com.albi.springBootProject.model.Padrone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PadroneRepository
        extends JpaRepository<Padrone, Integer> {
}
