package com.codebind;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext c=new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s=c.getBean(Samsung.class);
		s.config();

	}

}
