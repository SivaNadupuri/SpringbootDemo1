package com.example.jpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpa.CustomerRepositroy;
import com.example.jpa.entity.Customer;

@Component
public class CustomerRunner implements CommandLineRunner {
	
@Autowired
CustomerRepositroy custRepo;
	
	@Override
	public void run(String... args) throws Exception {
		 Customer customer =new Customer();
		 
		     customer.setCustomerId(111);
		     customer.setCustomerName("ABCD");
		     customer.setLocation("HYD");
		
		 custRepo.save(customer);

	}

}
