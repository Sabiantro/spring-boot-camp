package org.springframework.samples.petclinic.owner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.samples.petclinic.owner.dao.OwnerRepository;
import org.springframework.samples.petclinic.owner.dto.Owner;
import org.springframework.samples.petclinic.owner.dto.PetType;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;


	public Owner findById(Integer ownerId) {
		return this.ownerRepository.findById(ownerId);
	}

	public void save(Owner owner) {
		this.ownerRepository.save(owner);
	}

	public Page<Owner> findByLastName(String lastname, Pageable pageable) {
		return this.ownerRepository.findByLastName(lastname,pageable);
	}

	public Collection<PetType> findPetTypes() {
		return this.ownerRepository.findPetTypes();
	}
}
