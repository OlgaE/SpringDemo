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
		
		// Injecting objects:
		// Using Spring to initialize three poins A, B and C of class NewTriangle:
		System.out.println("");
		System.out.println("Injecting objects:");
		NewTriangle newtriangle = (NewTriangle) context.getBean("newtriangle");
		newtriangle.draw();
		
		// Using collections:
		System.out.println("");
		System.out.println("Using collections:");
		ListTriangle listtriangle = (ListTriangle) context.getBean("listtriangle");
		listtriangle.draw();
		
		// Using dependency injection, old way:
		System.out.println("");
		System.out.println("Using dependency injection:");
		TriangleWithInterface triangleInterface = (TriangleWithInterface) context.getBean("trianglewithinterface");
		triangleInterface.draw();
		
		// Using dependency injection, calling a Shape interface:
		System.out.println("");
		System.out.println("Dependency injection, calling Shape interface:");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}
}
