package com.itheima;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloSpring {
	public static void main(String[] args) {
		//1.��ȡspring��������ʼ��spring����������applicationContest����
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��spring������ȡ����ͨ��������ȡ������helloSpring��ʵ��
		HelloSpring helloSpring =(HelloSpring)applicationContext.getBean("helloSpring");
		//3.���ö���ķ���
		helloSpring.show();
	}
}
