package com.codebind;




public interface BankAccountRepository {
	public Double getBalance(long AccountId);
	public Double updateBalance(long AccountId,double newBalance);

}
