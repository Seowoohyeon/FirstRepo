import myobj.BallPen;
import myobj.Peach;

public class C02_OOP {

	/*
			# 객체지향 프로그래밍 (OOP : Object Oriented Programming)
		  		- 세상에 존재하는 모든 것들을 변수와 함수로 표현하려는 프로그래밍 방법론
		  		- 변수와 함수를 무분별하게 사용하기 보다는 현실에 존재하는 객체 단위로 묶어서 표현하여 가독성을 올린다
		  		- 객체 : 세상에 존재하는 모든 것을 말한다

		  	
		  	# 클래스
		  		- 객체를 프로그래밍 언어로 표현한 것
		  		- 클래스는 객체의 설계도이다 (정의한 시점에서는 실체가 없음)
		  		- 클래스를 통해 생성하는 실제 객체를 인스턴스라고 부른다
		  		- 클래스는 참조형 변수 타입이다
		  
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		// 다른 패키지에 선언한 퍼블릭클래스 사용
		myobj.Peach p1 = new myobj.Peach();
		Peach p2 = new Peach();
		
		a1.cal = 100;
		a2.cal = 120;
		a3.cal = 150;
		
		System.out.println(a1.cal);
		System.out.println(a2.cal);
		System.out.println(a3.cal); */
		
		BallPen bp = new BallPen(16);
		bp.size = 10;
		bp.capacity = 10.5;
		bp.color = "Black";
		bp.useing = "필기중!";
		bp.use();
		bp.notuse();
	}

}

class Apple { // Apple 타입의 
	/*
	 	인스턴스 변수
	 	 - 각 인스턴스마다 다른 값을 가질 수 있는 변수
	 	 - 필드, 속석, 멤버, 변수, 상태 .....
	 */
	int size;
	int cal;
	long lifetime;
	double sweet;
	
	/*
	  	인스턴스 메서드
	  	  - 인스턴스 변수를 활용하여 해당 인스턴스의 상태를 변화시키는 메서드
	 */
	void eat() {
		size--;
		cal -= 10;
	}
}





















