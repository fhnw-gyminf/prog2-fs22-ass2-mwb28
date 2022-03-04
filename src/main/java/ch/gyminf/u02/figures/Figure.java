package ch.gyminf.u02.figures;

import gui.Window;

public interface Figure {
	
	public void move(int dx, int dy);

	public int getX();

	public int getY();

	void draw(Window window);

}
