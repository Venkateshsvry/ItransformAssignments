package com.codebind;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bankImpl")
public class BankAccountRepositoryImpl implements BankAccountRepository {
	

@Autowired
 BankAccount bank;
	public Double getBalance(long AccountId) {
		
		return null;
		
	}

	public Double updateBalance(long AccountId, double newBalance) {
		
		return null;
	}

}
