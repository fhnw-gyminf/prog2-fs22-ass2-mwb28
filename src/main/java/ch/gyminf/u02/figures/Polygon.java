package ch.gyminf.u02.figures;

import gui.Window;

public   class Polygon  implements Figure, ClosedFigure, ClosedPolygonalChain {
	private int[] xCoords;
	private int[] yCoords;

	public Polygon(int[] xCoords, int[] yCoords) {
		this.xCoords = xCoords;
		this.yCoords = yCoords;

	}

	@Override
	public double getCircumference() {
		double circumference = 0;
		double dx[] = new double[xCoords.length];
		double dy[] = new double[yCoords.length];

		for (int i = 0; i < xCoords.length; i++) {
			dx[i] = Math.abs(xCoords[i] - xCoords[(i + 1) % xCoords.length]);
			dy[i] = Math.abs(yCoords[i] - yCoords[(i + 1) % yCoords.length]);
			circumference += Math.sqrt(Math.pow(dx[i], 2) + Math.pow(dy[i], 2));

		}

		return circumference;
	}

	@Override
	public double getArea() {
		double doubleArea = 0;
		for (int i = 0; i < xCoords.length; i++) {
			doubleArea += (yCoords[i] + yCoords[(i + 1) % yCoords.length])
					* (xCoords[i] - xCoords[(i + 1) % xCoords.length]);

		}
		return doubleArea / 2;
	}

	@Override
	public boolean isConvex() {
		
		int zPrev = 0;
		int zCurr = 0;

		for (int i=0; i< xCoords.length; i++){

			int dx1 = xCoords[(i+1)% xCoords.length] - xCoords[i];
			int dy1 = yCoords[(i+1)% xCoords.length] - yCoords[i];
			int dx2 = xCoords[(i+2)% xCoords.length] - xCoords[(i+1) % xCoords.length];
			int dy2 = yCoords[(i+2)% xCoords.length] - yCoords[(i+1) % xCoords.length];
			zCurr = dx1*dy2 - dy1*dx2;
			if(zCurr !=0){
				if(zCurr*zPrev < 0) return false;
				else {zPrev = zCurr;}

			}
		}
		return true;
	}
	/**
	 * contains methode  is too complicated....
	 */
	@Override
	public boolean contains(int x, int y) {
		int INF = Integer.MAX_VALUE;

		return false;
	}

	@Override
	public Line[] getEdges() {
		
		return null ;
	}

	@Override
	public int getNumberOfEdges() {
		
		return xCoords.length;
	}

	@Override
	public void draw(Window window) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * getX() and getY() returns the center of gravity of the polygon
	 */
	@Override
	public int getX() {
		double xCenterPoint =0; 
		for(int i=0; i < xCoords.length; i++){
			xCenterPoint+= (xCoords[i] + xCoords[(i+1)% xCoords.length])*(xCoords[i]*yCoords[(i+1)%yCoords.length]- xCoords[(i+1)%xCoords.length]*yCoords[i]);

		}
		xCenterPoint= (1/(6*getCircumference()))*xCenterPoint;
		return (int)xCenterPoint;
	}

	@Override
	public int getY() {
		double yCenterPoint =0;
		for(int i=0; i < yCoords.length; i++){
			yCenterPoint+= (yCoords[i] + yCoords[(i+1)% yCoords.length])*(xCoords[i]*yCoords[(i+1)%yCoords.length]- xCoords[(i+1)%xCoords.length]*yCoords[i]);

		}
		yCenterPoint= (1/(6*getCircumference()))*yCenterPoint;
		return (int)yCenterPoint;
	
	}

	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}
}
