package myobj.item;

public class Spear extends Item {
	int quantity;
	
	public Spear(String name, int price) {
		super(name, price);
		quantity = 10;
	}
	
	public void use() {
		for(int i = quantity; i >= 0; --i) {
			System.out.println(name+'('+ (i+1) +')' + "(을)를 1개 사용, 남은 수량 " + i);
		}
	}
	public static void main(String[] args) {
		new Spear("사냥창(10)", 30000).info();
		Spear spear = new Spear("사냥창", 30000);
		spear.use();
	}
}
