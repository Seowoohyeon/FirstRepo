
public class C05_Polymorphism {
	/*
	 	@ 다형성
	 		- 객체는 다양한 형태를 지닐 수 있다
	 		- 사과는 사과이기도 하고 과일이기도 하다
	 		- 과일은 과일이지만 사과는 아니다
	 		
	 	# 자식 클래스는 부모 클래스가 될 수 있다
	 		- 자식 클래스 타입이 부모 클래스 타입이 되는 것을 업캐스팅이라고 한다
	 		- 업 캐스팅된 객체는 자식 클래스에만 존재하는 것들을 모두 잊어버림
	 		- 오버라이드된 메소드는 자식 클래스에서 구현한 내용이 실행된다
	 		
	 	# 부모 클래스는 자식 클래스가 될 수 있다(다운 캐스팅)
	 		- 하지만 예외적으로 업캐스팅 되었던 인스턴스는
	 		    다시 원래 타입으로의 다운 캐스팅이 가능하다
	 */
	public static void main(String[] args) {
		new Food(new PigMeat(), new Vege(), new Balsamic());
		
		MainMaterial main_mat = new MainMaterial();
		MainMaterial main_mat2 = new Meat();
		
		Police p1 = new Police();
		p1.sayHi();
		p1.arrest("김강도");
		
		// person으로 업캐스팅된 police는 체포를 할 수 없다
		Person person = p1;
		Person person2 = new Person("전우치",20,10);
		// person.arrest;
		person.sayHi();
		
		// 다운 캐스팅을 활용해 원래 기능 다시사용
		((Police)person).arrest("김소매"); // 원래경찰 이었던 인스턴스는 다운캐스팅이 가능
		((Police)person2).arrest("김도적"); // 경찰이 아니였던 인스턴스는 다운캐스팅 불가
	}

}
class Food {
	
	MainMaterial mainMat;
	SubMaterial subMat;
	Sauce sauce;
	
	public Food(MainMaterial mainMat,SubMaterial subMat,Sauce sauce) {
		this.mainMat = mainMat;
		this.subMat = subMat;
		this.sauce = sauce;
	}
}

class PorkCutlet{
	public PorkCutlet(PigMeat pig,SubMaterial subMat,Sauce sauce) {
		
	}
}
// 제일 높은 부모
class MainMaterial {}
class SubMaterial {}
class Sauce {}

// 주재료 상속
class Fish extends MainMaterial {}
class Meat extends MainMaterial {}

// 주재료를 상속받은 클래스를 상속
class PigMeat extends Meat {}

// 부재료 상속
class Vege extends SubMaterial{}
class Fruit extends SubMaterial{}

// 소스상속
class Salsa extends Sauce{}
class Balsamic extends Sauce{}









