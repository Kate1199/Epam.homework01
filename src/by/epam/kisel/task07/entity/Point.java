package by.epam.kisel.task07.entity;

public class Point {
	
	private double x;
	private double y;
	private double distance;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		
		distance = countDistance();
	}
	
	private double countDistance() {
		return Math.sqrt(x * x + y * y);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "{x = " + x + " y = " + y + "}";
	}
	
	@Override
	public int hashCode() {
		return (int) (x * 31 - y * 31);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(this == o) return true;
		if(this.getClass() != o.getClass()) return false;
		
		Point point = (Point) o;
		return x == point.getX()
				&& y == point.getY()
				&& distance == point.getDistance();
	}
}
