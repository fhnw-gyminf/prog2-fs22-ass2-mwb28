package ch.gyminf.u02.figures.editor;

import java.util.Random;

import ch.gyminf.u02.figures.Circle;
import ch.gyminf.u02.figures.Figure;
import ch.gyminf.u02.figures.Point;
import ch.gyminf.u02.figures.Rectangle;
import ch.gyminf.u02.figures.RoundedRectangle;
import ch.gyminf.u02.figures.Triangle;
import gui.Window;

public class Editor {

	public static void main(String[] args) {
		Window window = new Window("Figures", 800, 600);

		Graphics g = new Graphics();
		g.addFigure(new Circle(350, 150, 50));
		g.addFigure(new RoundedRectangle(100, 100, 100, 100, 20));
		g.addFigure(new Rectangle(200, 200, 200, 200));
		g.addFigure(new Triangle(new Point(300, 300), new Point(350, 200), new Point(400, 300)));
		g.draw(window);

		window.open();

		boolean mousePressed = false;
		int x0 = 0, y0 = 0;
		Figure selectedFigure = null;
		Random random = new Random();

		while (window.isOpen()) {
			if (window.isLeftMouseButtonPressed()) {
				int x1 = (int) window.getMouseX();
				int y1 = (int) window.getMouseY();
				if (!mousePressed) {
					mousePressed = true;
					selectedFigure = g.getSelectedFigure(x1, y1);
				} else {
					if (selectedFigure != null) {
						selectedFigure.move(x1 - x0, y1 - y0);
					}
				}
				x0 = x1;
				y0 = y1;
			} else {
				mousePressed = false;
			}
			
			for(String key : window.getTypedKeys()) {
				if(key.equals("c")) {
					int r = 10 + random.nextInt(100);
					int x = r + random.nextInt((int)window.getWidth() - 2 * r);
					int y = r + random.nextInt((int)window.getHeight() - 2 * r);
					g.addFigure(new Circle(x, y, r));
				}
			}

			g.draw(window);
			window.refreshAndClear(20);
		}
	}

}
