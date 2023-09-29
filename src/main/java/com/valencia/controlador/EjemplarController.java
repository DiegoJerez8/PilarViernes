package com.valencia.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valencia.model.Ejemplar;
import com.valencia.service.EjemplarService;

@RestController
public class EjemplarController {

    @Autowired
    EjemplarService service;

    @PostMapping(value = "ejemplar/{isbn}/{titulo}/{tematica}")
    public List<Ejemplar> save(
            @PathVariable("isbn") int isbn,
            @PathVariable("titulo") String titulo,
            @PathVariable("tematica") String tematica) {

        Ejemplar ejemplar = new Ejemplar(isbn, titulo, tematica);

        return service.save(ejemplar);

    }
}
