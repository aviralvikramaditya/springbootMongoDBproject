package com.example.demo.rep;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Customer;

public interface CustomerRepo extends MongoRepository<Customer, String> {

}
