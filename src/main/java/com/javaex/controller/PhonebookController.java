package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.vo.PhonebookVo;

import ch.qos.logback.core.model.Model;

@RestController
public class PhonebookController {

	@Autowired
	private PhonebookService phonebookService;
	
	//리스트 
	@GetMapping(value="api/phones")
	public List<PhonebookVo> list(){
		System.out.println("PhonebookController.list()");
		List<PhonebookVo> phonebookList = phonebookService.exePhoneList();
		return phonebookList;
	}
	
	
}
