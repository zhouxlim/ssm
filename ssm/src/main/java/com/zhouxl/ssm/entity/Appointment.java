package com.zhouxl.ssm.entity;

import java.util.Date;

public class Appointment {
	
	private long bookId;
	
	private long studentId;
	
	private Date appointTime;
	
	private Book Book;

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public Date getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}

	public Book getBook() {	
		return Book;
	}

	public void setBook(Book book) {
		Book = book;
	}
	
	@Override
	public String toString() {
		return "Appointment [bookId=" + bookId + ", studentId=" + studentId + ", appointTime=" + appointTime + "]";
	}
	
}
