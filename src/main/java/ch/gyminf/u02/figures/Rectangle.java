package ch.gyminf.u02.figures;

import gui.Window;

public class Rectangle extends AbstractFigure implements ClosedFigure, ClosedPolygonalChain {
	private int width;
	private int height;


	public Rectangle(int x, int y, int w, int h) {
		super(x,y);
		this.width=w;
		this.height =h;
	}

	public int getWidth() {
		
		return width;
	}

	public int getHeight() {
		
		return height;
	}
	@Override
	public void draw(Window window) {
		window.fillRect(getX(), getY(), width, height);
	}

	@Override
	public boolean contains(int x, int y) {
		
		return  x >= getX() && x  < getX()+width && y >= getY() && y < getY()+ height;
	}

	@Override
	public double getArea() {
		
		return width*height;
	}

	@Override
	public double getCircumference() {
		
		return 2 *(width +height);
	}

	@Override
	public boolean isConvex() {
		
		return true;
	}

	@Override
	public Line[] getEdges() {
		Line[] rectEdges = new Line[4];
		
			rectEdges[0] = new Line(getX(),getY(), getX()+width, getY() );
			rectEdges[1] = new Line(getX()+width, getY(), getX()+width, getY()+height);
			rectEdges[2]= new Line(getX()+width, getY()+height, getX(), getY()+height );
			rectEdges[3]= new Line(getX(), getY()+height,getX(),getY());

		
		
		return rectEdges;
	}

	@Override
	public int getNumberOfEdges() {
		
		return 4;
	}

}
