package ch.gyminf.u02.figures;

import gui.Window;

public class Line implements Figure {
	private Point starPoint;
	private Point endPoint;

	public Line(int x0, int y0, int x1, int y1) {
		this.starPoint.x= x0;
		this.starPoint.y = y0;

		this.endPoint.x= x1;
		this.endPoint.y = y1;


	}

	public Point getStart() {
		
		return starPoint;
	}

	public Point getEnd() {
		
		return endPoint;
	}

	/**
	 * move methode moves the line without rotation.
	 */
	@Override
	public void move(int dx, int dy) {
		starPoint.x += dx;
		starPoint.y += dy;
		endPoint.x +=dx;
		endPoint.y += dy;


		
		
	}
	/**
	 * getX() and getY()  returns the middle point of the line 
	 */
	
	@Override
	public int getX() {	
	return this.endPoint.x - this.starPoint.x;	
		
	}
	@Override
	public int getY() {
	return this.endPoint.y - this.starPoint.y;
	}
	@Override
	public void draw(Window window) {
		window.drawLine(starPoint.getX(),starPoint.getX(),endPoint.getX(),endPoint.getY());
	}

}
