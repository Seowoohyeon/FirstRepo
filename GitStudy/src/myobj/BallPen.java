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
		System.out.println("���� ���̴� " + size +"CM �Դϴ�" );
	}
	
	public void use() {
		capacity -= 0.1;
	}
	
	public void notuse() {
		System.out.println("�ʱⳡ!");
	}
	
	
	
}
