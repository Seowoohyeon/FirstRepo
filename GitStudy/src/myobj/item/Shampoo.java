package myobj.item;

public class Shampoo extends Item{
	String fragrance;
	
	public Shampoo(String name, int price) {
		super(name, price);
		fragrance = "향긋함";
	}
	
	public void use() {
		System.out.println(name+"(을)를 사용하니 "+fragrance+"(이)가 느껴집니다");
	}
	public static void main(String[] args) {
		new Shampoo("헤어좋아", 8900).info();
		Shampoo shampoo = new Shampoo("헤어좋아", 8900);
		shampoo.use();
	}
}
