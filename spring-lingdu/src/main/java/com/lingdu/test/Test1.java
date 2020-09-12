package com.lingdu.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppTest.class);
		System.out.println(annotationConfigApplicationContext.getBean(TestBean.class));
	}
}
