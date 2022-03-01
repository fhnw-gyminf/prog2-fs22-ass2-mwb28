package ch.gyminf.u02.figures;

import gui.Window;

public class Triangle implements Figure, ClosedFigure, ClosedPolygonalChain{
 
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
		
		window.drawLine(firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY());
		window.drawLine(secondPoint.getX(),secondPoint.getY(), thirdPoint.getX(), thirdPoint.getY());
		window.drawLine(thirdPoint.getX(),thirdPoint.getY(), firstPoint.getX(), firstPoint.getY());
		
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


	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isConvex() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Line[] getEdges() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int getNumberOfEdges() {
		
		return 3;
	}



}
