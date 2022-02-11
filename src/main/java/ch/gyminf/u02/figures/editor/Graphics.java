package ch.gyminf.u02.figures.editor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import ch.gyminf.u02.figures.ClosedFigure;
import ch.gyminf.u02.figures.Figure;
import gui.Window;

public class Graphics {
	private List figures = new ArrayList();
	
	public List getFigures() {
		return figures;
	}
	
	public void addFigure(Object f) {
		figures.add(f);
	}
	
	public void draw(Window window) {
		for(Object f : figures) {
			((Figure)f).draw(window);
		}
	}

	public Figure getSelectedFigure(int x, int y) {
		ListIterator it = figures.listIterator(figures.size());
		while(it.hasPrevious()) {
			Object f = it.previous();
			if(f instanceof ClosedFigure && ((ClosedFigure)f).contains(x, y)) return (Figure)f;
		}
		return null;
	}

}
