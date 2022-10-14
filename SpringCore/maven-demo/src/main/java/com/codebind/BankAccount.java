package com.codebind;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bankAccount")
public class BankAccount {
	public Long getAccountId() {
		return AccountId;
	}
	public void setAccountId(Long accountId) {
		AccountId = accountId;
	}
	public String getAccHolderName() {
		return AccHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		AccHolderName = accHolderName;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Value("6242")
	private Long AccountId;
	@Value("venkatesh")
	private String AccHolderName;
	@Value("savings")
	private String AccountType;
	@Value("1000")
	private Double balance;
	
	@Override
	public String toString() {
		return "BankAccount [AccountId=" + AccountId + ", AccHolderName=" + AccHolderName + ", AccountType="
				+ AccountType + ", balance=" + balance + "]";
	}

}
