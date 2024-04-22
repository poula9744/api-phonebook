package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.vo.PhonebookVo;

@RestController
public class PhonebookController {

	@Autowired
	private PhonebookService phonebookService;
	
	//리스트 
	@GetMapping(value="api/phones")
	public List<PhonebookVo> list(){
		System.out.println("PhonebookController.listt()");
		List<PhonebookVo> phonebookList = phonebookService.exePhoneList();
		return phonebookList;
	}
	
	
}
