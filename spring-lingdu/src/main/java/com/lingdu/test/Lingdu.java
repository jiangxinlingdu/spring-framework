package com.lingdu.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lingdu {

	@Autowired
	//模拟循环依赖问题
	private TestBean testBean;

	public void test() {
		System.out.println("=============");
	}

}
