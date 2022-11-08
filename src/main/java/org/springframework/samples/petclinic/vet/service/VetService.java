package org.springframework.samples.petclinic.vet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.samples.petclinic.vet.dao.VetRepository;
import org.springframework.samples.petclinic.vet.dto.Vet;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VetService {

	@Autowired
	private VetRepository vetRepository;

	public Collection<Vet> findAll() {

		return this.vetRepository.findAll();
	}

	public Page <Vet> findAll(Pageable pageable){

		return this.vetRepository.findAll(pageable);
	}

}
