package org.springframework.samples.petclinic.owner.dao;

import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.samples.petclinic.owner.dto.Pet;
import org.springframework.samples.petclinic.owner.dto.PetType;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PetRepository extends Repository<Pet, Integer> {
	@Query("SELECT ptype FROM PetType ptype ORDER BY ptype.name")
	@Transactional(readOnly = true)
	List<PetType> findPetTypes();

	void save(Pet pet);


	Pet findById(Integer id);
}
