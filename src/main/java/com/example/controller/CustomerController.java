package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.CustomerDto;
import com.example.entity.Customer;
import com.example.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	private CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService)
	{
		this.customerService=customerService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody CustomerDto customer)
	{
		Customer tmp=customerService.addCustomer(customer);
		return ResponseEntity.ok(tmp);
	}
	
	@PostMapping("/addAll")
	public int addAllCustomers(@RequestBody List<Customer> list)
	{
		customerService.addAllCustomer(list);
		return list.size();
	}
	
	@GetMapping("/findAll")
	public Iterable<Customer> findAllCustomer()
	{
		return customerService.findAllCustomer();
	}
	
	@GetMapping("/findCustomer/{firstName}")
	public List<Customer> findCustomerFirtsName(@PathVariable String firstName)
	{
		return customerService.findCustomerFirstName(firstName);
	}
}
