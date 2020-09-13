package com.lingdu.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppTest.class);
		TestBean bean = annotationConfigApplicationContext.getBean(TestBean.class);
		bean.testLingdu();
	}
}
