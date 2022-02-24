package ch.gyminf.u02.figures;

import gui.Window;

public class Circle extends AbstractFigure implements ClosedFigure{
	private int r;

	public Circle(int x, int y, int r) {
		super(x,y);
		this.r =r;
		
	}

	public int getRadius() {
		
		return r;
	}
	@Override
	public void draw(Window window) {
		window.fillCircle(getX(), getY(), r);
		
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

}
