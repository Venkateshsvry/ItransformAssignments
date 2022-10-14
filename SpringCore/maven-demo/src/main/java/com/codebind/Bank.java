package com.codebind;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages = "com.codebind")
public class Bank {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//BankAccount b = (BankAccount) context.getBean("bankAccount");
		BankAccountRepositoryImpl b1=(BankAccountRepositoryImpl) context.getBean("bankImpl");
//System.out.println(b);
System.out.println(b1);
//		BankAccountRepositoryImpl b1=(BankAccountRepositoryImpl) context.getBean("repository");
//		b1.updateBalance(62426842400l, 2000.00);
	}

}
