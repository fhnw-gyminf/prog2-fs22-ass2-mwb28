package ch.gyminf.u02.figures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class FigureTests {
	
	static class Tuple {
		Point p1, p2;
		Tuple(Point p1, Point p2) {
			if(p1.x < p2.x || p1.x == p2.x && p1.y < p2.y) {
				this.p1 = p1; this.p2 = p2;
			} else {
				this.p1 = p2; this.p2 = p1;
			}
		}
		@Override
		public int hashCode() {
			return ((p1.x*13+p2.x)*13+p1.y)*13+p2.y;
		}
		@Override
		public boolean equals(Object t) {
			return t instanceof Tuple && ((Tuple)t).p1.equals(p1) && ((Tuple)t).p2.equals(p2);
		}
	}

//	@Test
//	public void polygonTest() {
//		int[] x = new int[]{1,3,2};
//		int[] y = new int[]{0,0,2};
//		Polygon cp = new Polygon(x.clone(), y.clone());
//		assertTrue(cp instanceof ClosedFigure, "ClosedPolygon must implement interface ClosedFigure");
//		assertTrue(cp instanceof ClosedPolygonalChain, "ClosedPolygon must implement interface Polygon");
//		assertTrue(((ClosedFigure)cp).isConvex());
//		
//		ClosedPolygonalChain p = (ClosedPolygonalChain)cp;
//		assertEquals(3, p.getNumberOfEdges());
//		Line[] lines = p.getEdges();
//		assertEquals(3, lines.length);
//		Set<Tuple> s1 = new HashSet<Tuple>();
//		Set<Tuple> s2 = new HashSet<Tuple>();
//		for(int i = 0; i < lines.length; i++) {
//			s1.add(new Tuple(lines[i].getStart(), lines[i].getEnd()));
//			s2.add(new Tuple(new Point(x[i], y[i]), new Point(x[(i+1) % lines.length], y[(i+1) % lines.length])));
//		}
//		assertTrue(s1.equals(s2));
//		
//		int dx = 1;
//		int dy = -1;
//		cp.move(dx, dy);
//		p = (ClosedPolygonalChain)cp;
//		assertEquals(3, p.getNumberOfEdges());
//		lines = p.getEdges();
//		assertEquals(3, lines.length);
//		s1 = new HashSet<Tuple>();
//		s2 = new HashSet<Tuple>();
//		for(int i = 0; i < lines.length; i++) {
//			s1.add(new Tuple(lines[i].getStart(), lines[i].getEnd()));
//			s2.add(new Tuple(new Point(x[i]+dx, y[i]+dy), new Point(x[(i+1) % lines.length]+dx, y[(i+1) % lines.length]+dy)));
//		}
//		assertTrue(s1.equals(s2));
//
//		cp = new Polygon(new int[]{1,2,1,0}, new int[]{0,0,1,-2});
//		assertFalse(((ClosedFigure)cp).isConvex());
//		
//		cp = new Polygon(new int[]{-1,1,1,-1}, new int[]{0,0,1,-1});
//		assertFalse(((ClosedFigure)cp).isConvex());
//		assertEquals(0, cp.getArea(), 1e-12);
//		assertEquals(6.82842712474619, cp.getCircumference(), 1e-12);
//		
//		cp = new Polygon(new int[]{0,2,2,0}, new int[]{0, 0, 2, 2});
//		assertTrue(((ClosedFigure)cp).isConvex());
//		assertEquals(4, cp.getArea(), 1e-12);
//		assertEquals(8, cp.getCircumference(), 1e-12);
//
//		cp = new Polygon(new int[]{0,2,2,0}, new int[]{0, 0, 1, -1});
//		assertFalse(((ClosedFigure)cp).isConvex());
//		assertEquals(0, cp.getArea(), 1e-12);
//		assertEquals(4+2*Math.sqrt(2), cp.getCircumference(), 1e-12);
//
//		cp = new Polygon(new int[]{1,3,3,1,1,-1,-1,-3,-3,-1,-1,1}, new int[]{1,1,-1,-1,-3,-3,-1,-1,1,1,3,3});
//		assertFalse(((ClosedFigure)cp).isConvex());
//		assertEquals(20, cp.getArea(), 1e-12);
//		assertEquals(24, cp.getCircumference(), 1e-12);
//	}
//
//	@Test
//	public void polygon2Test() {
//		int[] x = new int[]{0,1,3,2};
//		int[] y = new int[]{0,0,0,2};
//		Polygon cp = new Polygon(x, y);
//		assertTrue(cp instanceof ClosedPolygonalChain, "ClosedPolygon must implement interface Polygon");
//		assertTrue(((ClosedFigure)cp).isConvex());
//		
//		x = new int[]{0,1,3,2};
//		y = new int[]{0,0,0,-2};
//		cp = new Polygon(x, y);
//		assertTrue(cp instanceof ClosedPolygonalChain, "ClosedPolygon must implement interface Polygon");
//		assertTrue(((ClosedFigure)cp).isConvex());
//
//		x = new int[]{2,0,1,3};
//		y = new int[]{2,0,0,0};
//		cp = new Polygon(x, y);
//		assertTrue(cp instanceof ClosedPolygonalChain, "ClosedPolygon must implement interface Polygon");
//		assertTrue(((ClosedFigure)cp).isConvex());
//		
//		x = new int[]{ 2,0,1,3};
//		y = new int[]{-2,0,0,0};
//		cp = new Polygon(x, y);
//		assertTrue(cp instanceof ClosedPolygonalChain, "ClosedPolygon must implement interface Polygon");
//		assertTrue(((ClosedFigure)cp).isConvex());
//
//		x = new int[]{ 2,3};
//		y = new int[]{-2,-2};
//		cp = new Polygon(x, y);
//		assertTrue(cp instanceof ClosedPolygonalChain, "ClosedPolygon must implement interface Polygon");
//		assertTrue(((ClosedFigure)cp).isConvex());
//		assertEquals(2, cp.getCircumference(), 1e-12);
//		assertEquals(0, cp.getArea(), 1e-12);
//
//		x = new int[]{3};
//		y = new int[]{7};
//		cp = new Polygon(x, y);
//		assertTrue(cp instanceof ClosedPolygonalChain, "ClosedPolygon must implement interface Polygon");
//		assertTrue(((ClosedFigure)cp).isConvex());
//		assertEquals(0, cp.getCircumference(), 1e-12);
//		assertEquals(0, cp.getArea(), 1e-12);
//	}
//
//	@Test
//	public void rectangleTest() {
//		Rectangle r = new Rectangle(0, 0, 2, 1);
//		assertEquals(2, r.getWidth());
//		assertEquals(1, r.getHeight());
//		assertEquals(0, r.getX());
//		assertEquals(0, r.getY());
//		assertEquals(2.0, r.getArea(), 1e-15);
//		assertEquals(6.0, r.getCircumference(), 1e-15);
//		r.move(2, -3);
//		assertEquals(2, r.getWidth());
//		assertEquals(1, r.getHeight());
//		assertEquals(2, r.getX());
//		assertEquals(-3, r.getY());
//		assertEquals(2.0, r.getArea(), 1e-15);
//		assertEquals(6.0, r.getCircumference(), 1e-15);
//
//		assertTrue(r instanceof ClosedFigure, "Rectangle must implement interface ClosedFigure");
//		ClosedFigure cf = (ClosedFigure) r;
//		assertTrue(cf.isConvex(), "Rectangle is convex");
//		
//		int[] x = new int[]{2,4,4,2};
//		int[] y = new int[]{-3,-3,-2,-2};
//		assertTrue(r instanceof ClosedPolygonalChain, "Rectangle must implement interface Polygon");
//		ClosedPolygonalChain p = (ClosedPolygonalChain) r;
//		assertEquals(4, p.getNumberOfEdges());
//		Line[] lines = p.getEdges();
//		assertEquals(4, lines.length);
//		Set<Tuple> s1 = new HashSet<Tuple>();
//		Set<Tuple> s2 = new HashSet<Tuple>();
//		for(int i = 0; i < lines.length; i++) {
//			s1.add(new Tuple(lines[i].getStart(), lines[i].getEnd()));
//			s2.add(new Tuple(new Point(x[i], y[i]), new Point(x[(i+1) % lines.length], y[(i+1) % lines.length])));
//		}
//		assertTrue(s1.equals(s2));
//
//	}
//	
//	@Test
//	public void circleTest() {
//		Circle c = new Circle(2,5,10);
//		assertEquals(Math.PI*100, c.getArea(), 1e-10);
//		assertEquals(Math.PI*20, c.getCircumference(), 1e-10);
//		assertEquals(2, c.getX());
//		assertEquals(5, c.getY());
//		assertEquals(10, c.getRadius());
//		assertTrue(c instanceof ClosedFigure, "Circle must implement interface ClosedFigure");
//		ClosedFigure p = (ClosedFigure) c;
//		assertTrue(p.isConvex(), "Every circle is convex");
//		assertFalse(c instanceof ClosedPolygonalChain, "Circle must not be a polygon");
//	}
//	
//	@Test
//	public void squareTest() {
//		Square s = new Square(2,5,10);
//		assertEquals(100, s.getArea(), 1e-12);
//		assertEquals(40, s.getCircumference(), 1e-12);
//		assertEquals(2, s.getX());
//		assertEquals(5, s.getY());
//		assertEquals(10, s.getWidth());
//		s.move(-2, -5);
//		assertEquals(100, s.getArea(), 1e-12);
//		assertEquals(40, s.getCircumference(), 1e-12);
//		assertEquals(0, s.getX());
//		assertEquals(0, s.getY());
//		assertEquals(10, s.getWidth());
//		assertTrue(s instanceof ClosedFigure, "Square must implement interface ClosedFigure");
//		ClosedFigure cf = (ClosedFigure) s;
//		assertTrue(cf.isConvex(), "Square is convex");
//		
//		assertTrue(s instanceof ClosedPolygonalChain, "Square must implement interface Polygon");
//		int[] x = new int[]{0,10,10,0};
//		int[] y = new int[]{0,0,10,10};
//		ClosedPolygonalChain p = (ClosedPolygonalChain) s;
//		assertEquals(4, p.getNumberOfEdges());
//		Line[] lines = p.getEdges();
//		assertEquals(4, lines.length);
//		Set<Tuple> s1 = new HashSet<Tuple>();
//		Set<Tuple> s2 = new HashSet<Tuple>();
//		for(int i = 0; i < lines.length; i++) {
//			s1.add(new Tuple(lines[i].getStart(), lines[i].getEnd()));
//			s2.add(new Tuple(new Point(x[i], y[i]), new Point(x[(i+1) % lines.length], y[(i+1) % lines.length])));
//		}
//		assertTrue(s1.equals(s2));
//	}
//	
//	@Test
//	public void lineTest(){
//		Line l = new Line(0, 2, 1, 1);
//		assertEquals(new Point(0, 2), l.getStart());
//		assertEquals(new Point(1,1), l.getEnd());
//		l.move(-1, -2);
//		assertEquals(new Point(-1, 0), l.getStart());
//		assertEquals(new Point(0,-1), l.getEnd());
//		assertFalse(l instanceof ClosedFigure, "Line must not implement interface ClosedFigure");
//		assertFalse(l instanceof ClosedPolygonalChain, "Line must not implement interface Polygon");
//	}
//	
//	@Test
//	public void roundRectTest(){
//		RoundedRectangle rr = new RoundedRectangle(1, -1, 6, 4, 2);
//		assertEquals(6, rr.getWidth());
//		assertEquals(4, rr.getHeight());
//		assertEquals(2, rr.getCornerRadius());
//		assertEquals(1, rr.getX());
//		assertEquals(-1, rr.getY());
//		assertEquals(4*(2+Math.PI), rr.getArea(), 1e-15);
//		assertEquals(4*(1+Math.PI), rr.getCircumference(), 1e-15);
//		assertTrue(rr instanceof ClosedFigure, "RoundedRectangle must implement interface ClosedFigure");
//		ClosedFigure p = (ClosedFigure) rr;
//		assertTrue(p.isConvex(), "every RoundedRectangle is convex");
//		assertFalse(rr instanceof ClosedPolygonalChain, "RoundedRectangle must not implement interface Polygon");
//		rr.move(5, 3);
//		assertEquals(6, rr.getWidth());
//		assertEquals(4, rr.getHeight());
//		assertEquals(2, rr.getCornerRadius());
//		assertEquals(6, rr.getX());
//		assertEquals(2, rr.getY());
//		assertEquals(4*(2+Math.PI), rr.getArea(), 1e-15);
//		assertEquals(4*(1+Math.PI), rr.getCircumference(), 1e-15);
//	}
//	
//	@Test
//	public void triangleTest(){
//		Triangle t = new Triangle(new Point(0, 0), new Point(4, 0), new Point(2,2));
//		assertEquals(4, t.getArea(), 1e-15);
//		assertEquals(4*(1+Math.sqrt(2)), t.getCircumference(), 1e-15);
//		
//		assertTrue(t instanceof ClosedFigure, "Triangle must implement interface ClosedFigure");
//		ClosedFigure cf = (ClosedFigure) t;
//		assertTrue(cf.isConvex(), "every triangle is convex");
//		t.move(2, 3);
//		assertEquals(4, t.getArea(), 1e-15);
//		assertEquals(4*(1+Math.sqrt(2)), t.getCircumference(), 1e-15);
//
//	
//		int[] x = new int[]{2,6,4};
//		int[] y = new int[]{3,3,5};
//		assertTrue(t instanceof ClosedPolygonalChain, "Triangle must implement interface Polygon");
//		ClosedPolygonalChain p = (ClosedPolygonalChain) t;
//		assertEquals(3, p.getNumberOfEdges());
//		Line[] lines = p.getEdges();
//		assertEquals(3, lines.length);
//		Set<Tuple> s1 = new HashSet<Tuple>();
//		Set<Tuple> s2 = new HashSet<Tuple>();
//		for(int i = 0; i < lines.length; i++) {
//			s1.add(new Tuple(lines[i].getStart(), lines[i].getEnd()));
//			s2.add(new Tuple(new Point(x[i], y[i]), new Point(x[(i+1) % lines.length], y[(i+1) % lines.length])));
//		}
//		assertTrue(s1.equals(s2));
//	}

}
