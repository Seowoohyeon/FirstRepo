package myobj.item;

public class Candy extends Item{
	int healthy;
	
	public Candy(String name, int price) {
		super(name, price);
		healthy = 10;
	}
	
	public void use() {
		System.out.println(name + "(À»)¸¦ ¸Ô¾î¼­ Ã¼·ÂÀÌ " + healthy + "(ÀÌ)°¡ µÊ");
	}
	
	public static void main(String[] args) {
		new Candy("¾Ë»çÅÁ", 1000).info();
		Candy candy = new Candy("¾Ë»çÅÁ", 1000);
		candy.use();
	}
	
}
