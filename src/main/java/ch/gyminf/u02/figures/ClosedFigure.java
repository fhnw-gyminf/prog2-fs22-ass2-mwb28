package ch.gyminf.u02.figures;

public interface ClosedFigure {
	double getArea();
	double getCircumference();
	boolean isConvex();
	boolean contains(int x, int y);
}
