package com.nt.test;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/message")
public class WishMessageGenerator {
	
	
	@GetMapping("/generate")
	public ResponseEntity<String> getMessage()
	{
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		String body=null;
		if(hour<12)
			 body="Good Morning";
		else if(hour<16)
			 body="Good AgterNoon";
		else if(hour<20)
			 body="Good AfterEvening";
		else 
			 body="Good Night";
		
		HttpStatus status=HttpStatus.OK;
		ResponseEntity<String> entity=new ResponseEntity<String>(body,status);
		return entity;
		
	}

}
