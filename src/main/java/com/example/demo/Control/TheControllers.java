package com.example.demo.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Customer;
import com.example.demo.rep.CustomerRepo;

@Controller
public class TheControllers {
	
	@Autowired
	CustomerRepo repo;
	
	@PostMapping("/save")
	@ResponseBody
	public String saveObj(Customer customer) {
		System.out.println(customer);
		repo.save(customer);	
		return "done";
	}
	
	@GetMapping("/")
	@ResponseBody
	public String KAS() {
		return "first_page";
	}

}
