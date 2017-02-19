package com.zhouxl.ssm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhouxl.ssm.dao.AppointmentDao;
import com.zhouxl.ssm.dao.BookDao;
import com.zhouxl.ssm.dto.AppointExecution;
import com.zhouxl.ssm.entity.Appointment;
import com.zhouxl.ssm.entity.Book;
import com.zhouxl.ssm.enums.AppointStateEnum;
import com.zhouxl.ssm.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private BookDao bookDao;
    
    @Autowired
    private AppointmentDao appointmentDao;
    

    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    public List<Book> getList() {
        return bookDao.queryAll(0, 1000);
    }

    @Transactional

    public AppointExecution appoint(long bookId, long studentId) {
        try {
            // �����
            int update = bookDao.reduceNumber(bookId);
            if (update <= 0) {// ��治��
                return new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);
            } else {
                // ִ��ԤԼ����
                int insert = appointmentDao.insertAppointment(bookId, studentId);
                if (insert <= 0) {// �ظ�ԤԼ
                    return new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);
                } else {// ԤԼ�ɹ�
                    Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
                    return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            // ���б������쳣ת��Ϊ�������쳣
            return new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);
        }
    }
}
