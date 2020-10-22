package com.lingdu.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppTest.class);
		TestBean bean = annotationConfigApplicationContext.getBean(TestBean.class);
		bean.testLingdu();
	}


	/**
	 spring 中间涉及到哪些组件
	 每个组件分别介绍  再怎么结合的？ 怎么做扩展的 ？

	 怎么编译源码
	 结合测试用例
	 aop
	 ioc
	 扩展
	 bean 生命周期
	 常用 注解 使用 （源码分析）

	 循环依赖？
	 为什么 需要三级缓存？



	 开源项目 比如 apollo 怎么整合到 spring ？
	 dubbo 怎么整合到 spring 的？

	 如果你自己写一个插件 怎么通过整个到 spring 中？
	 */
}
