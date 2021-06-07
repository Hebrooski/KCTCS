package com.ntier.calculate;

public class Sphere implements SurfaceAreaCalculatable{
	private double radius;

	@Override
	public double calculateSA() {
		
		return 4*PI*Math.pow(radius, 2);
	}

	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
}
