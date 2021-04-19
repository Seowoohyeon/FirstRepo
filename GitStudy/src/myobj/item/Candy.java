package myobj.item;

public class Candy extends Item{
	int healthy;
	
	public Candy(String name, int price) {
		super(name, price);
		healthy = 10;
	}
	
	public void use() {
		System.out.println(name + "(��)�� �Ծ ü���� " + healthy + "(��)�� ��");
	}
	
	public static void main(String[] args) {
		new Candy("�˻���", 1000).info();
		Candy candy = new Candy("�˻���", 1000);
		candy.use();
	}
	
}
