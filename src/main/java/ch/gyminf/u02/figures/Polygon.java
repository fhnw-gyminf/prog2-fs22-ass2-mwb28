package ch.gyminf.u02.figures;

public class Polygon implements ClosedFigure, ClosedPolygonalChain {
	private int[] xCoords;
	private int[] yCoords;

	public Polygon(int[] xCoords, int[] yCoords) {
		this.xCoords = xCoords;
		this.yCoords = yCoords;

	}

	@Override
	public double getCircumference() {
		double circumference = 0;
		double dx[] = new double[xCoords.length];
		double dy[] = new double[yCoords.length];

		for (int i = 0; i < xCoords.length; i++) {
			dx[i] = Math.abs(xCoords[i % xCoords.length] - xCoords[(i + 1) % xCoords.length]);
			dy[i] = Math.abs(yCoords[i % yCoords.length] - yCoords[(i + 1) % yCoords.length]);
			circumference += Math.sqrt(Math.pow(dx[i], 2) + Math.pow(dy[i], 2));

		}

		return circumference;
	}

	@Override
	public double getArea() {
		double doubleArea = 0;
		for (int i = 0; i < xCoords.length; i++) {
			doubleArea += (yCoords[i] + yCoords[(i + 1) % yCoords.length])
					* (xCoords[i] - xCoords[(i + 1) % xCoords.length]);

		}
		return doubleArea / 2;
	}

	@Override
	public boolean isConvex() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Line[] getEdges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumberOfEdges() {
		// TODO Auto-generated method stub
		return 0;
	}
}
