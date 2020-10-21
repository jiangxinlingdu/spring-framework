package com.lingdu.test;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Configurable
@ComponentScan("com.lingdu.test")
@Import(ImportTest.class)
public class AppTest {
}
