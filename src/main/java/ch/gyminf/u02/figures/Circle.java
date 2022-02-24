package ch.gyminf.u02.figures;

import gui.Window;

public class Circle extends AbstractFigure{
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

}
