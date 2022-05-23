package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.CustomerDto;
import com.example.entity.Customer;
import com.example.repository.CustomerRepository;

@Service
public class CustomerService {
	
	private CustomerRepository repository;
	
	@Autowired
	public CustomerService(CustomerRepository repository)
	{
		this.repository=repository;
	}
	
	public Customer addCustomer(CustomerDto customer)
	{
		Customer newCustomer= new Customer(customer.getId(),customer.getFirstName(),customer.getLastName(),customer.getAge());
		repository.save(newCustomer);
		
		return newCustomer;
	}

	public void addAllCustomer(List<Customer> list) {
		// TODO Auto-generated method stub
		
		repository.saveAll(list);
		
	}

	public Iterable<Customer> findAllCustomer() {
		
		return repository.findAll();
	}

	public List<Customer> findCustomerFirstName(String firstName) {
		// TODO Auto-generated method stub
		return repository.findByFirstName(firstName);
	}
}
