package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	private Point center;
	
	@Override
	public void draw() {
		System.out.println("Drawing a circle at (" + center.getX() + "," + center.getY() + ")");
		
	}

	public Point getCenter() {
		return center;
	}

	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}

}
