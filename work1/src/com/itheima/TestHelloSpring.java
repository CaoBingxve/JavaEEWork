package com.itheima;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloSpring {
	public static void main(String[] args) {
		//1.获取spring容器，初始化spring容器，加载applicationContest配置
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从spring容器获取对象，通过容器获取配置中helloSpring的实例
		HelloSpring helloSpring =(HelloSpring)applicationContext.getBean("helloSpring");
		//3.调用对象的方法
		helloSpring.show();
	}
}
