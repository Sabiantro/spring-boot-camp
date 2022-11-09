package org.springframework.samples.petclinic.bill.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.bill.dto.Bill;
import org.springframework.samples.petclinic.bill.service.BillService;
import org.springframework.samples.petclinic.owner.dto.Visit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BillController {


	@Autowired
	private BillService billservice;

	@GetMapping("/bills")
	public List<Bill> showBillList (@RequestParam String factura){

		List <Bill> result = billservice.findBillsByVisit(factura);

		return result;


	}


	@GetMapping("/bills/{idBill}/visits/{idVisit}")
	public Bill showVisitDetails (@PathVariable("idBill") int idBill, @PathVariable("idVisit") int idVisit){

		return billservice.findById(idBill);


	}


	@PutMapping ("/bills/{idBill}/visits/{idVisit}")

	public Bill asociateBill (@PathVariable("idBill") int idBill, @PathVariable("idVisit") int idVisit){

		return billservice.findById(idBill);


	}

}
