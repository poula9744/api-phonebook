package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PhonebookVo;

@Repository
public class PhonebookDao {

	@Autowired
	private SqlSession sqlSession;

	// 리스트
	public List<PhonebookVo> phonebookList() {
		System.out.println("PhonebookDao.phonebookList()");

		List<PhonebookVo> phonebookList = sqlSession.selectList("phonebook.list");
		System.out.println(phonebookList);
		return phonebookList;
	}

	// 한 명 정보 데려오기
	public PhonebookVo selectOne(int no) {
		System.out.println("PhonebookDao.selectOne()");
		PhonebookVo phoneVo = sqlSession.selectOne("phonebook.selectOne", no);
		return phoneVo;
	}

}
