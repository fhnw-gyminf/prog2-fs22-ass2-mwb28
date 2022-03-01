package ch.gyminf.u02.figures;

import gui.Window;

public class RoundedRectangle extends AbstractFigure implements ClosedFigure {
	private int width;
	private int height;
	private int cornerRadius;


	public RoundedRectangle(int x, int y, int width, int height, int cornerRadius) {
		super(x, y);
		this.width =width;
		this.height = height;
		this.cornerRadius =cornerRadius;

	}

	public int getWidth() {
		
		return width;
	}

	public int getHeight() {
		
		return height;
	}

	public int getCornerRadius() {
		

		return cornerRadius;
	}
	@Override
	public void draw(Window window) {
		//window.setColor(0, 0, 0);
		//window.fillRect(getX()+cornerRadius, getY(), width-(2*cornerRadius), height);
		//window.setColor(0, 255, 0);
		//window.fillRect(getX(), getY()+ cornerRadius, cornerRadius, height- (2*cornerRadius));
		//window.setColor(255, 0, 0);
		//window.fillRect(getX()+width-cornerRadius,getY()+cornerRadius, cornerRadius, height - (2*cornerRadius));
		//window.setColor(0, 0, 255);
		window.fillRect(getX()+cornerRadius, getY(), width-(2*cornerRadius), height);
		window.fillRect(getX(), getY()+ cornerRadius, width, height- (2*cornerRadius));
		window.fillCircle(getX()+cornerRadius, getY()+cornerRadius, cornerRadius);
		window.fillCircle(getX()+width-cornerRadius, getY()+cornerRadius, cornerRadius);
		window.fillCircle(getX()+width-cornerRadius, getY()+height-cornerRadius, cornerRadius);
		window.fillCircle(getX()+cornerRadius,getY()+height-cornerRadius , cornerRadius);
		
	}

	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isConvex() {
		// TODO Auto-generated method stub
		return false;
	}

}
