package com.codebind;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Customer t=(Customer) context.getBean("test");
Address t1=(Address) context.getBean("address1");
		
System.out.println(t);
System.out.println(t1);

	}

}

