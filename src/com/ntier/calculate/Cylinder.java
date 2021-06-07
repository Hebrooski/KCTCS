package com.ntier.calculate;

public class Cylinder implements SurfaceAreaCalculatable{
	
	private double height;
	private double raduis;

	@Override
	public double calculateSA() {
		return (2*PI*raduis*height)+(2*PI*Math.pow(raduis, 2));
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRaduis() {
		return raduis;
	}

	public void setRaduis(double raduis) {
		this.raduis = raduis;
	}

	public Cylinder(double height, double raduis) {
		this.height = height;
		this.raduis = raduis;
	}
	
	

}
