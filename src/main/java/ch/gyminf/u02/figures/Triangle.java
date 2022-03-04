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

	

	/**
	 * getX()/ getY() returns the first point of the triangle
	 */
	@Override
	public int getX() {
		
		return firstPoint.x;
	}


	@Override
	public int getY() {
		
		return firstPoint.y;
	}


	@Override
	public void move(int dx, int dy) {
		firstPoint.x+= dx;
		firstPoint.y += dy;
		secondPoint.x+=dx;
		secondPoint.y+=dy;
		thirdPoint.x+=dx;
		thirdPoint.y+=dy;

		
		
	}


	@Override
	public boolean contains(int x, int y) {
		
		 double mainTriangle = getArea();
		 double firstTrinagle = calculateArea(x, y, secondPoint.x, secondPoint.y, thirdPoint.x, thirdPoint.y);
		 double secondTriangle = calculateArea(firstPoint.x, firstPoint.y, x, y, thirdPoint.x, thirdPoint.y);
		 double thirdTriangle = calculateArea(firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y, x, y);

		return mainTriangle == (firstTrinagle + secondTriangle + thirdTriangle);
	}


	@Override
	public double getArea() {
		//Math.abs((thirdPoint.x - firstPoint.x) * (secondPoint.y - firstPoint.y)/2);
		//rea A = [ x1(y2 – y3) + x2(y3 – y1) + x3(y1-y2)]/2 
		// double area = Math.abs((firstPoint.x*(secondPoint.y - thirdPoint.y) +secondPoint.x *(thirdPoint.y 
		// - firstPoint.y)+ thirdPoint.x *(firstPoint.y- secondPoint.y))/2);
		return calculateArea(firstPoint.x, firstPoint.y,secondPoint.x, secondPoint.y,thirdPoint.x, thirdPoint.y);
		
	}

	private double calculateArea(int x1, int y1, int x2, int y2, int x3, int y3){
		return Math.abs((x1*(y2 - y3) + x2 *(y3 - y1)+ x3 *(y1- y2))/2);

	}

	/**
	 * this solution should implemented with lines... not with Points... 
	 */
	@Override
	public double getCircumference() {
		
		Point vector1 = new Point(thirdPoint.x -firstPoint.x, thirdPoint.y- firstPoint.y);
		Point vector2 = new Point(secondPoint.x- firstPoint.x, secondPoint.y - firstPoint.y);
		Point vector3 = new Point(secondPoint.x - thirdPoint.x,secondPoint.y - thirdPoint.y);

		double lengthVector1 = Math.sqrt((Math.pow(vector1.x, 2) +Math.pow(vector1.y, 2)));
		double lengthVector2 = Math.sqrt((Math.pow(vector2.x, 2) +Math.pow(vector2.y, 2)));
		double lengthVector3 = Math.sqrt((Math.pow(vector3.x, 2) +Math.pow(vector3.y, 2)));

		return lengthVector1 +lengthVector2 + lengthVector3;
	}


	@Override
	public boolean isConvex() {
		
		return true;
	}


	@Override
	public Line[] getEdges() {
		Line[] trinangleEdges = new Line[3];
			trinangleEdges[0] = new Line(firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);
			trinangleEdges[1] = new Line(secondPoint.x, secondPoint.y, thirdPoint.x,thirdPoint.y);
			trinangleEdges[2] = new Line(thirdPoint.x, thirdPoint.y, firstPoint.x,firstPoint.y);

		return trinangleEdges;
	}


	@Override
	public int getNumberOfEdges() {
		
		return 3;
	}



}
