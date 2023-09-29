package com.valencia.service;

import java.util.List;
import java.util.Optional;

import com.valencia.model.Ejemplar;

public interface EjemplarService {
    
    /**
     * acciones que quiero que realice , la implementacion se realizará en EjemplatServiceImpl.java
     * @return
     */
    List <Ejemplar> getAll();

    Optional<Ejemplar> getItemById(int isbn);

    List<Ejemplar> save(Ejemplar ejemplar);

    void update(Ejemplar ejemplar);

    List<Ejemplar> deleteById(int isbn);
}
