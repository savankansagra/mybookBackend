package com.mybook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybook.models.Expert;
import com.mybook.repository.ExpertRepository;

@Service
public class ExpertService {
	
	@Autowired
	ExpertRepository expertRepository;
	
	public List<Expert> findAllExperts(){
		return expertRepository.findAll();
	}
}
