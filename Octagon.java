
public class Octagon implements Shape{
	
	private double sideLength;
	
	public Octagon(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public double getSideLength() {
		return sideLength;
	}

	@Override
	public double getArea() {
		double area = 2 * Math.pow(sideLength, 2) * (1 + Math.sqrt(2));
		return Math.floor(area * 100) / 100;
	}

	@Override
	public double getPerimeter() {
		return 8 * sideLength;
	}
	
}
