package ch.gyminf.u02.figures;

import gui.Window;

public class Square extends AbstractFigure implements ClosedFigure, ClosedPolygonalChain {
	private int width;
	private Line [] line;

	public Square(int x, int y, int w) {
		super(x, y);
		this.width = w;	
		this.line = new Line[4];
		line[0] = new Line(x, y, x+w, y);
		line[1] = new Line(x+w, y, x+w, y+w);
		line[2] = new Line(x+w, y+w, x, y+w);
		line[3] = new Line( x, y+w, x, y);
		
		
		
	}

	public int getWidth() {
		
		return width;
	}
	@Override
	public void draw(Window window) {
		window.fillRect(getX(), getY(), width, width);
	}

	@Override
	public boolean contains(int x, int y) {
		
		return x  < getX()+width && y < getY()+ width;
	}

	@Override
	public double getArea() {
		
		return width*width;
	}

	@Override
	public double getCircumference() {
		
		return 4*width;
	}

	@Override
	public boolean isConvex() {
		
		return true;
	}

	@Override
	public Line[] getEdges() {
			
		return line;
	}

	@Override
	public int getNumberOfEdges() {
		
		return 4;
	}

}
