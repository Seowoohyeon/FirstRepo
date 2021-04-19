package myobj.item;

public class Spear extends Item {
	int quantity;
	
	public Spear(String name, int price) {
		super(name, price);
		quantity = 10;
	}
	
	public void use() {
		for(int i = quantity; i >= 0; --i) {
			System.out.println(name+'('+ (i+1) +')' + "(��)�� 1�� ���, ���� ���� " + i);
		}
	}
	public static void main(String[] args) {
		new Spear("���â(10)", 30000).info();
		Spear spear = new Spear("���â", 30000);
		spear.use();
	}
}
