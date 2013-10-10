package com.demo.moreannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		 
		// using the ApplicationContext:
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemo2.xml");
		
		// Using dependency injection, calling a Shape interface:
		System.out.println("");
		System.out.println("Dependency injection, calling Shape interface:");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}
}
