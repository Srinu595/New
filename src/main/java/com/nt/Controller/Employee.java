package com.nt.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
	
	@RequestMapping("/emp")
	public String home() {
		System.out.print("printed");
		return ("<h4>welcome</h4>");
	}

}
