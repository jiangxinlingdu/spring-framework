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

	 扩展点体现在如何能够在 spring 容器中动态注册、修改和增强 bean
	 ImportBeanDefinitionRegistrar 这个类可以通过代码来动态加载 bean，这些 bean 可以是普通的定义好的 class 也可以是动态代理。

	 ImportBeanDefinitionRegistrar 通常和 @Import 注解配合使用。
	 @Import 会将 ImportBeanDefinitionRegistrar 的实现类注入到 spring 容器中。
	 从而 spring 容器可以遍历调用 ImportBeanDefinitionRegistrar 接口的 registerBeanDefinitions 方法。


	 看到 Spring 源码中接口以 Aware 结尾的接口(XXXAware) 在 Spring 中表示对 XXX 可以感知,
	 通俗点解释就是:如果在某个类里面想要使用 spring 的一些东西,就可以通过实现 XXXAware 接口告诉 Spring,
	 Spring 看到后就会给你送过来,而接收的方式是通过实现接口唯一方法 set-XXX.
	 比如:有一个类想要使用当前的 ApplicationContext,那么我们只需要让它实现 ApplicationContextAware 接口,然后实现接口中的唯一方法
	 void setApplicationContext(ApplicationContext applicationContext)
	 就可以了,spring 会自动调用这个方法将 applicationContext 传给我们,我们只需要接受就可以了,并可以用接收到的内容做一些业务逻辑.

	 spring 中比较常用的扩展点：
	 ImportBeanDefinitionRegistrar
	 BeanFactoryPostProcessor
	 BeanPostProcessor

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
