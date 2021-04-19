package myobj.item;

public class Sword extends Item{
	static int durability;
		
		public Sword(String name, int price) {
			super(name, price);
			durability = 50;
		}
		
		public void use() {
			System.out.println(name + "(��)�� �ֵθ�, ������  -1");
			durability--;
			System.out.println("-> ���� ������ "+durability);
		}
		public static void main(String[] args) {
			new Sword("�⺻ ��", 1000).info();
			Sword sword = new Sword("�⺻��", 1000);
			for(int i = durability; i > 0; --i) {
				sword.use();
			}
		}
}
