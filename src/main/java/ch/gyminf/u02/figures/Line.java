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
	 * getX() and getY()  returns the middle of the Line 
	 */
	
	@Override
	public int getX() {	
	return this.startPoint.x + ((this.endPoint.x- this.startPoint.x)/2);	
		
	}
	@Override
	public int getY() {
	return  this.startPoint.y + ((this.endPoint.y- this.startPoint.y)/2);
	}
	@Override
	public void draw(Window window) {
		window.drawLine(startPoint.getX(),startPoint.getX(),endPoint.getX(),endPoint.getY());
	}

	@Override
	public Line[] getEdges() {
		
		return new Line[] {this};
	}

	@Override
	public int getNumberOfEdges() {
		
		return 1;
	}

}
