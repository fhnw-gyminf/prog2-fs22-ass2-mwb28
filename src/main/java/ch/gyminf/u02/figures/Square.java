package ch.gyminf.u02.figures;

import gui.Window;

public class Square extends AbstractFigure implements ClosedFigure {
	private int width;

	public Square(int x, int y, int w) {
		super(x, y);
		this.width = w;	
	}

	public int getWidth() {
		
		return width;
	}
	@Override
	public void draw(Window window) {
		window.fillRect(getX(), getY(), width, width);
	}

}
