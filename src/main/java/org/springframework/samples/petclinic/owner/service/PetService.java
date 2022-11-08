package org.springframework.samples.petclinic.owner.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.owner.dao.PetRepository;
import org.springframework.samples.petclinic.owner.dto.Pet;
import org.springframework.samples.petclinic.owner.dto.PetType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

	@Autowired
	private PetRepository petRepository;

	public void save(Pet pet){
		this.petRepository.save(pet);
	}

	public Pet findById(Integer id){
		return this.petRepository.findById(id);
	}
	public List<PetType> findPetType(){
		return this.petRepository.findPetTypes();
	}
}
