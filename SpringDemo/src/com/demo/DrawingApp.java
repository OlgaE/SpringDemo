package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
	public static void main(String[] args) {
		
		// Using the new:
		// Triangle triangle = new Triangle();
		
		// Using the factory:
		// BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		 
		// or using the ApplicationContext:
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		// Triangle triangle = (Triangle) factory.getBean("triangle");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}
