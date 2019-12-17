package com.ustglobal.librarymanagementsystem.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="books_registration")
	public class BooksRegistration {
		
		@Id
		@Column
		private int registrationId;
		@Column
		private int bookId;
		@Column
		private int id;
		@Column
		private Date registrationDate;
		
		public int getRegistrationId() {
			return registrationId;
		}
		public void setRegistrationId(int registrationId) {
			this.registrationId = registrationId;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Date getRegistrationDate() {
			return registrationDate;
		}
		public void setRegistrationDate(Date registrationDate) {
			this.registrationDate = registrationDate;
		}

}

