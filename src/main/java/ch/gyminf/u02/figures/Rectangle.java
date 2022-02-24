package ch.gyminf.u02.figures;

import gui.Window;

public class Rectangle extends AbstractFigure {
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

}
