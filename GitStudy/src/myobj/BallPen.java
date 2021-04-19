package myobj;

public class BallPen{
	public int size;
	public double capacity;
	public String useing;
	public String color;
	
	public BallPen(double capacity) {
		this.capacity = capacity;
	}
	
	public BallPen() {
		size = 7;
		System.out.println("볼펜 길이는 " + size +"CM 입니다" );
	}
	
	public void use() {
		capacity -= 0.1;
	}
	
	public void notuse() {
		System.out.println("필기끝!");
	}
	
	
	
}
