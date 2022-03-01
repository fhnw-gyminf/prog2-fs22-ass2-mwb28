package ch.gyminf.u02.figures;

import gui.Window;

public class Square extends AbstractFigure   implements ClosedFigure, ClosedPolygonalChain {
	private int width;
	
	private Polygon square;

	public Square(int x, int y, int w) {
		super(x, y);
		this.width = w;	
		int[] xCoords = new int[4];
		int[] yCoords = new int[4];
		xCoords[0]=x; xCoords[1]=x + w; xCoords[2]= x +w;xCoords[3] =x;
		yCoords[0]=y; yCoords[1]=y; yCoords[2]= y+w;yCoords[3] =y+w;
	
		


		this.square = new Polygon(xCoords, yCoords); 
	
		//({{1,2,3}, {2,4,5 }});//new Polygon({{x,x+w,x}, {y,y+h,y+h }});
		//square[0][0]= 
		// lines[0] = new Line(x, y, x+w, y);
		// lines[1] = new Line(x+w, y, x+w, y+w);
		// lines[2] = new Line(x+w, y+w, x, y+w);
		// lines[3] = new Line( x, y+w, x, y);
		
		
		
	}

	public int getWidth() {
		
		return width;
	}
	@Override
	public void draw(Window window) {
		window.fillRect(getX(), getY(), width, width);
	}

	@Override
	public boolean contains(int x, int y) {
		
		return x >= getX() && x  < getX()+width && y >= getY() && y < getY()+ width;
	}

	@Override
	public double getArea() {
		
		return width*width;
	}

	@Override
	public double getCircumference() {
		
		return 4*width;
	}

	@Override
	public boolean isConvex() {
		
		return true;
	}

	@Override
	public Line[] getEdges() {
			
		return null;
	}

	@Override
	public int getNumberOfEdges() {
		
		return 4;
	}

}
