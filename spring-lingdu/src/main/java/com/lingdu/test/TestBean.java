package com.lingdu.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean {

	@Autowired
	private Lingdu lingdu;


	public void testLingdu() {
		lingdu.test();
	}
}
