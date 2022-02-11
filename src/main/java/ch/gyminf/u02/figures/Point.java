package ch.gyminf.u02.figures;

public class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public boolean equals(Object p) {
		return p instanceof Point && ((Point) p).x == x && ((Point) p).y == y;
	}
}