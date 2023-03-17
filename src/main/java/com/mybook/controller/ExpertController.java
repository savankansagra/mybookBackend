package com.mybook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybook.models.Expert;
import com.mybook.services.ExpertService;

@RestController
@RequestMapping("/expert")
@CrossOrigin
public class ExpertController {

	@Autowired
	ExpertService expertservice;
	
	@GetMapping
	public ResponseEntity<List<Expert>> getAllExpers(){
		List<Expert> allExperts =  expertservice.findAllExperts();
		if(allExperts.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(allExperts);
	}
}
