package ch.gyminf.u02.figures;

public class Polygon {
	private int [] xCoords;
	private int [] yCoords;





	public Polygon(int[] xCoords, int[] yCoords) {
		this.xCoords = xCoords;
		this.yCoords = yCoords;

	}

	public double getCircumference() {
		double circumference =0;
		double dx[] = new double [xCoords.length];
		double dy[] = new double[yCoords.length];

		for(int i = 0; i < xCoords.length; i++){
			dx[i]= Math.abs(xCoords[i%xCoords.length] - xCoords[(i+1)%xCoords.length]);
			dy[i]= Math.abs(yCoords[i%yCoords.length] - yCoords[(i+1)%yCoords.length]);
			circumference += Math.sqrt(Math.pow(dx[i], 2) + Math.pow(dy[i], 2));



		}

		return circumference;
	}

	public double getArea() {
		double doubleArea =0;
		for (int i = 0; i < xCoords.length; i++){
			doubleArea+= (yCoords[i]+ yCoords[(i+1)% yCoords.length])*(xCoords[i]- xCoords[(i+1)%xCoords.length]);
			 
		}
		return doubleArea/2;
	}
	
}
