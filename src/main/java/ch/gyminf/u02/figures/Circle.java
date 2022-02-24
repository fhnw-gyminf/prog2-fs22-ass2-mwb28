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
		
		return x > getX()-getRadius() && x < getX()+ getRadius() && y > getY()-getRadius() && y < getY()+getRadius();
	}

	@Override
	public double getArea() {
		
		return Math.PI * r*r;
		
	}

	@Override
	public double getCircumference() {
		
		return 2*Math.PI*getRadius();
	}

	@Override
	public boolean isConvex() {
		
		return true;
	}

}
