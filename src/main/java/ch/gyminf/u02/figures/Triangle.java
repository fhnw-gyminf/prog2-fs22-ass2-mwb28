package ch.gyminf.u02.figures;

import gui.Window;

public class Triangle implements Figure{
 
	private Point firstPoint;
	private Point secondPoint;
	private Point thirdPoint;


	public Triangle(Point p0, Point p1, Point p2) {
		this.firstPoint =p0;
		this.secondPoint = p1;
		this.thirdPoint = p2;
		
		
	}


	@Override
	public void draw(Window window) {
		
		window.drawLine(firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);
		window.drawLine(secondPoint.x,secondPoint.y, thirdPoint.x, thirdPoint.y);
		window.drawLine(thirdPoint.x,thirdPoint.y, firstPoint.x, firstPoint.y);
		window.
	}

	


	@Override
	public int getX() {
		
		return 0;
	}


	@Override
	public int getY() {
		
		return 0;
	}


	@Override
	public void move(int dx, int dy) {
		
		
	}



}
