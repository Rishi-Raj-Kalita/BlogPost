package com.example.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.entity.Customer;

public interface CustomerRepository extends ElasticsearchRepository<Customer,String> {
	List<Customer> findByFirstName(String firstName);
}
