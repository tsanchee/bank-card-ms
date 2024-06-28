package com.bank.card.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "card")
public class Card {
	
	@Id
	private String id;
	private String accountId;
	private String cardNumber;
	private String cardName;
	private String cvv;
	private String year;
	private String month;
	private boolean isExpired;
	private boolean isActive;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public boolean isExpired() {
		return isExpired;
	}
	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public Card(String id, String accountId, String cardNumber, String cardName, String cvv, String year, String month,
			boolean isExpired, boolean isActive) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.cardNumber = cardNumber;
		this.cardName = cardName;
		this.cvv = cvv;
		this.year = year;
		this.month = month;
		this.isExpired = isExpired;
		this.isActive = isActive;
		
	}
	public Card() {
		super();
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", accountId=" + accountId + ", cardNumber=" + cardNumber + ", cardName=" + cardName
				+ ", cvv=" + cvv + ", year=" + year + ", month=" + month + ", isExpired=" + isExpired + ", isActive="
				+ isActive + "]";
	}
	
	
	
}