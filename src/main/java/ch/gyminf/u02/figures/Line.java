package ch.gyminf.u02.figures;

import gui.Window;

public class Line implements Figure, OpenPolygonalChain {
	 private Point startPoint;
	 private Point endPoint;
	

	public Line(int x0, int y0, int x1, int y1) {
		startPoint = new Point(x0, y0);
		endPoint = new Point (x1, y1);
	


	}
	

	public Point getStart() {
		
		return startPoint;
	}

	public Point getEnd() {
		
		return endPoint;
	}

	/**
	 * move methode moves the line without rotation.
	 */
	@Override
	public void move(int dx, int dy) {
		startPoint.x += dx;
		startPoint.y += dy;
		endPoint.x +=dx;
		endPoint.y += dy;


		
		
	}
	/**
	 * getX() and getY()  returns the startPoint of the Line 
	 */
	
	@Override
	public int getX() {	
	return this.startPoint.x;	
		
	}
	@Override
	public int getY() {
	return  this.startPoint.y;
	}
	@Override
	public void draw(Window window) {
		window.drawLine(startPoint.getX(),startPoint.getX(),endPoint.getX(),endPoint.getY());
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
