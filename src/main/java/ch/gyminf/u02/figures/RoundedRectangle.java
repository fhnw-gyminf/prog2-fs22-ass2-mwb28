package ch.gyminf.u02.figures;

import gui.Window;

public class RoundedRectangle extends AbstractFigure {
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
		
		window.fillRect(getX(), getY(), width, height);
		window.fillRect(getX()-cornerRadius, getY()+ cornerRadius, cornerRadius, height- (2*cornerRadius));
		window.fillRect(getX()+width,getY()+cornerRadius, cornerRadius, height - (2*cornerRadius));
		window.fillCircle(getX(),getY()+cornerRadius, cornerRadius);
		window.fillCircle(getX()+width, getY()+cornerRadius, cornerRadius);
		window.fillCircle(getX()+width, (getY()+height)-cornerRadius, cornerRadius);
		window.fillCircle(getX(), (getY()+height)-cornerRadius, cornerRadius);

	}

}
