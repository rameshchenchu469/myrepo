package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.model.Customer;

@Controller
public class CustomerOperationsController 
{
	@GetMapping("/")
public String showHome()
{
	return "welcome";
}
	
	@GetMapping("/register")
	public String showCustomerRegisterForm(@ModelAttribute("cust")Customer cust)
	{
		return "register_customer";
	}
}
