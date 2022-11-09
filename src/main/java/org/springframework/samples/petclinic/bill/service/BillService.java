package org.springframework.samples.petclinic.bill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.bill.dao.BillRepository;
import org.springframework.samples.petclinic.bill.dto.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

	@Autowired
	private BillRepository billRepository;


	public List<Bill> findBillsByVisit(String factura) {
		return billRepository.findBillsByVisit(factura);
	}

	public Bill findById(int idBill) {
		return  billRepository.findById(idBill);
	}
}
