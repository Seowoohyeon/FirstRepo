package myobj.item;

public class Sword extends Item{
	static int durability;
		
		public Sword(String name, int price) {
			super(name, price);
			durability = 50;
		}
		
		public void use() {
			System.out.println(name + "(을)를 휘두름, 내구도  -1");
			durability--;
			System.out.println("-> 남은 내구도 "+durability);
		}
		public static void main(String[] args) {
			new Sword("기본 검", 1000).info();
			Sword sword = new Sword("기본검", 1000);
			for(int i = durability; i > 0; --i) {
				sword.use();
			}
		}
}
