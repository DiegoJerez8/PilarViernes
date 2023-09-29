package com.valencia.service;

import java.util.List;
import java.util.Optional;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.valencia.model.Ejemplar;

@Service
public class EjemplarServiceImpl implements EjemplarService {

	@Autowired
	RestTemplate template;

	private String url = "http://localhost:8080/";

	/**
	 * recogemos todos los objetos "Ejemplar"
	 */
	@Override
	public List<Ejemplar> getAll() {

		return null;
	}

	/**
	 * recojo el objeto por Id
	 */
	@Override
	public Optional<Ejemplar> getItemById(int isbn) {

		return null;
	}

	/**
	 * creo y guardo un nuevo objeto ejemplar
	 */
	@Override
	public List<Ejemplar> save(Ejemplar ejemplar) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'save'");
	}

	/**
	 * actualizo los datos de un objeto ejemplar
	 */
	@Override
	public void update(Ejemplar ejemplar) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}

	/**
	 * borro un dato ejemplar por Id
	 */
	@Override
	public List<Ejemplar> deleteById(int isbn) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
	}

}
