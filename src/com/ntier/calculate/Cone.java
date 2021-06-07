package com.ntier.calculate;

public class Cone implements SurfaceAreaCalculatable{
	
	private double radius;
	private double length;
	
	@Override
	public double calculateSA() {
		return PI*radius*length;
	}

	public Cone(double radius, double length) {
		super();
		this.radius = radius;
		this.length = length;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	
	

}
