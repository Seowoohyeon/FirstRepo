
public class C05_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	# 클래스 상속
		 	  - 이미 존재하는 클래스를 그대로 물려받거나 고쳐서 사용하는것
		 	  - 상속해주는 클래스를 부모 클래스 또는 슈퍼 클래스라고 한다
		 	  - 상속받는 클래스를 자식 클래스 또는 서브클래스라고 한다 
		 	  
		 */
		 
		Person[] ps = new Person[3];
		
		ps[0] = new Person("홍길동", 10, 10);
		ps[1] = new Person("김길동", 55, 15);
		ps[2] = new Person("이길동", 30, 12);
		
		ps[0].sayHi();
		ps[1].sayHi();
		ps[2].sayHi();
		
		// 부모클래스에서 만들었던 기능을 자유롭게 사용 가능
		Police po = new Police();
		po.sayHi();
		po.run();
		po.walk();
		
		po.thisSuperTest("둘리");

	}

}
class Person{
	String name;
	int age;
	int speed;
	
	public Person(String name, int age, int speed) {
		this.name = name;
		this.age = age;
		this.speed = speed;
	}
	
	void sayHi() {
		if(age < 0) {
			System.out.println("유효하지 않은 나이 입니다.");
		} else if(age <= 25) {
			System.out.printf("안녕 이름은 %s 이고 나이는 %d살 이야\n ", name, age);
		} else if(age <= 45) {
			System.out.printf("안녕하세요 이름은 %s 이고 나이는 %d세 입니다\n", name, age);
		} else {
			System.out.printf("반갑습니다 이름은 %s 이고 나이는 %d세 입니다\n", name, age);
		}
	}
	
	void walk() {
		System.out.printf("%s씨는 한번 걸으면 &d미터 윰직입니다\n", name, speed /2);
	}
	
	void run() {
		System.out.printf("%s씨는 %d미터 뛰었습니다\n", name, speed);
	}
	
}

/*
 	상속 받는 클래스는 생성자에서 가장 먼저 부모의 생성자를 호출해야 한다
 	부모 클래스에 기본생성자가 존재하면 생략할 수 있지만, 존재하지 않을때는 생략 불가
 	자식 클래스는 부모의 메소드를 마음대로 고쳐사용 가능(오버라이드)
 	부모 클래스와 자식 클래스에 똑같은 이름을 가진 자원이 있는경우 슈퍼와 디스로 정확하게 구분 가능
*/

class Police extends Person {
	// 자식 클래스의 생성자에서는 첫 줄에 슈퍼를 반드시 호출해야 한다(필수)
	String name = "마동석";
	
	
	public Police(){
		super("김경찰", 27, 20);
		//슈퍼는 부모 클래스의 생성를 호출할 떄 사용
	}
	
	@Override
	void sayHi() {
		System.out.printf("안녕하십니까 저는 %s 형사 입니다\n", name);
	}
	
	void thisSuperTest(String name) {
		System.out.println("그냥 name : " + name);
		System.out.println("this.name : " + this.name);
		System.out.println("super.name : " + super.name);
	}
	 
	void arrest(String suspect) {
		System.out.printf("%s형사는 용의자 %s씨를 체포했습니다", name, suspect);
	}
}

/*	class Programmer extends Police {
	// 모든 생성자를 생략할 시
	// 자식 클래스에도 기본 생성자가 생기도 부모 클래스의 기본 생성자를 사용한다
} */






















