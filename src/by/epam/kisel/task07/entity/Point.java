package by.epam.kisel.task07.entity;

public class Point {
	
	private double x;
	private double y;
	private double distance;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		
		distance = Math.sqrt(x * x + y * y);
	}
	
	 
	
	public Point findTheNearest(Point p) {
		
		if (this.distance < p.distance) {
			return this;
		} else if (this.distance == p.distance){
			return null;
		} else {
			return p;
		}
	}
	
	public static void outputTheNearest(Point p) {
		if(p != null ) {
			System.out.println("Точка с координатами " + p.toString() + " ближе к началу координат");
		} else  {
			System.out.println("Точки равноудалены от начала координат");
		}
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
	
	public String toString() {
		return "{x = " + x + " y = " + y + "}";
	}
	
	public int hashCode() {
		return (int) (x * 5 - y * 12);
	}
	
	public boolean equals(Point p) {
		return this.hashCode() == p.hashCode();
	}
}
