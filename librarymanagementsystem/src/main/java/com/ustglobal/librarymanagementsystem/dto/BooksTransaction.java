package com.ustglobal.librarymanagementsystem.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="books_transaction")
	public class BooksTransaction {
		
		@Id
		@Column
		private int transactionId;
		@Column
		private int registrationId;
		@Column
		private Date issueDate;
		@Column
		private Date returnDate;
		@Column
		private double fine;

		public int getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(int transactionId) {
			this.transactionId = transactionId;
		}

		public int getRegistrationId() {
			return registrationId;
		}

		public void setRegistrationId(int registrationId) {
			this.registrationId = registrationId;
		}

		public Date getIssueDate() {
			return issueDate;
		}

		public void setIssueDate(Date issueDate) {
			this.issueDate = issueDate;
		}

		public Date getReturnDate() {
			return returnDate;
		}

		public void setReturnDate(Date returnDate) {
			this.returnDate = returnDate;
		}

		public double getFine() {
			return fine;
		}

		public void setFine(double fine) {
			this.fine = fine;
		}

		
		
		

	}



