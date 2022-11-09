package org.springframework.samples.petclinic.bill.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.bill.dto.Bill;
import org.springframework.samples.petclinic.owner.dto.Owner;
import org.springframework.samples.petclinic.owner.dto.Visit;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Repository
public class BillRepository implements Repository<Bill, Integer> {


	public List<Bill> findBillsByVisit(String factura) {
		List<Bill> result =null ;
		if(factura=="pagado") {


		} else if (factura=="no_pagado") {


		}

		return result;
	}


	public Bill findById(int idBill) {

		//@Query("SELECT owner FROM Owner owner left join fetch owner.pets WHERE owner.id =:id")
		//@Transactional(readOnly = true)
		//Bill findById(idBill);
		return null;
	}

}
