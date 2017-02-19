package com.zhouxl.ssm.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhouxl.ssm.dao.BaseTest;
import com.zhouxl.ssm.dto.AppointExecution;
import com.zhouxl.ssm.service.BookService;

public class BookServiceImplTest extends BaseTest{
	
	@Autowired
	private BookService bookService;
	
	@Test
	public void testAppoint() throws Exception {
		
		long bookId = 1001;
		long studentId = 12345678910L;
		
		AppointExecution execution = bookService.appoint(bookId, studentId);
		
		System.out.println(execution);
	}
}
;