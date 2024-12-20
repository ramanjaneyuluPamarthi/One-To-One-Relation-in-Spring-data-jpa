package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Address;
import com.nit.entity.Employee;
import com.nit.repository.AddressRepo;
import com.nit.repository.EmployeeRepo;

@Service
public class EmployeeAddress {

	@Autowired
	private EmployeeRepo empRepo;
	@Autowired
	private AddressRepo addressRepo;
	
	public void empAddress() {
		Employee emp = new Employee();
		emp.setEmpName("Don");
		emp.setEmpSal(34440.0);
		emp.setEmpId(2);
		
		
		  Address a1 = new Address(); a1.setCity("Mmm"); a1.setState("Goa");
		  a1.setCountry("India");
		  
		  
		  a1.setEmp(emp);
		 
		Address address = new Address();
		address.setCity("Chennai");
		address.setState("TamilNadu ");
		address.setCountry("India");
		address.setEmp(emp);
		List<Address> addresses=List.of(a1,address);
		emp.setAddr(addresses);
		
		Employee save = empRepo.save(emp);
		System.out.println("Record Saved..."+save);
		
		}
}
