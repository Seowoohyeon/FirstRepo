package myobj.item;

public class Shampoo extends Item{
	String fragrance;
	
	public Shampoo(String name, int price) {
		super(name, price);
		fragrance = "�����";
	}
	
	public void use() {
		System.out.println(name+"(��)�� ����ϴ� "+fragrance+"(��)�� �������ϴ�");
	}
	public static void main(String[] args) {
		new Shampoo("�������", 8900).info();
		Shampoo shampoo = new Shampoo("�������", 8900);
		shampoo.use();
	}
}
