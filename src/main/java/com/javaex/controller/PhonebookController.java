package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.vo.PhonebookVo;

@RestController
public class PhonebookController {

	@Autowired
	private PhonebookService phonebookService;

	// 리스트
	@GetMapping(value = "api/phones")
	public List<PhonebookVo> list() {
		System.out.println("PhonebookController.list()");
		List<PhonebookVo> phonebookList = phonebookService.exePhoneList();
		return phonebookList;
	}

	//수정폼
	@GetMapping(value = "api/phones/{personId}")
	public PhonebookVo modifyForm(@PathVariable("personId") int personId) {
		System.out.println("PhonebookController.modifyInfo()");
		PhonebookVo phoneVo = phonebookService.exeModifyForm(personId);
		return phoneVo;
	}

	// 삭제
	@DeleteMapping(value = "api/phones/{personId}")
	public int deleteInfo(@PathVariable("personId") int personId) {
		System.out.println("PhonebookController.deleteInfo()");
		int count = phonebookService.exeDeletePhone(personId);
		return count;
	}

	// 수정
	@PutMapping(value = "api/phones/modify/{personId}")
	public String modifyInfo(@PathVariable("personId") int personId, @RequestBody PhonebookVo phonebookVo) {
		System.out.println("PhonebookController.modifyInfo()");
		int count = phonebookService.exeModifyPhone(phonebookVo);
		String result = "{\"count\": " + count + "}";
		return result;
	}

}
