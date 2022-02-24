package ch.gyminf.u02.figures;

import gui.Window;

public class Line implements Figure, OpenPolygonalChain {
	private Point starPoint;
	private Point endPoint;
	private Point[] openChain;

	public Line(int x0, int y0, int x1, int y1) {
		this.starPoint.x= x0;
		this.starPoint.y = y0;

		this.endPoint.x= x1;
		this.endPoint.y = y1;


	}
	public Line(Point points []){
		

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
	 * getX() and getY()  returns the startPoint of the Line 
	 */
	
	@Override
	public int getX() {	
	return this.starPoint.x;	
		
	}
	@Override
	public int getY() {
	return  this.starPoint.y;
	}
	@Override
	public void draw(Window window) {
		window.drawLine(starPoint.getX(),starPoint.getX(),endPoint.getX(),endPoint.getY());
	}

	@Override
	public Line[] getEdges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumberOfEdges() {
		// TODO Auto-generated method stub
		return 0;
	}

}
