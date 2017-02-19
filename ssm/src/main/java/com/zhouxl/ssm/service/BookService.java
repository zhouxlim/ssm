package com.zhouxl.ssm.service;

import java.util.List;

import com.zhouxl.ssm.dto.AppointExecution;
import com.zhouxl.ssm.entity.Book;

public interface BookService {

	/**
	 * ��ѯһ��ͼ��
	 * 
	 * @param bookId
	 * @return
	 */
	Book getById(long bookId);

	/**
	 * ��ѯ����ͼ��
	 * 
	 * @return
	 */
	List<Book> getList();

	/**
	 * ԤԼͼ��
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	AppointExecution appoint(long bookId, long studentId);

}
