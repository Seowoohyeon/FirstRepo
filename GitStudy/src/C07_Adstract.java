
public class C07_Adstract {

	public static void main(String[] args) {
		/*
		 	# 추상 클래스
		 	  - 완성을 자식 클래스에세 미루는 클래스
		 	  - 클래스 내부에 추상 메서드를 지닌 클래스는 앞에 abstract를 붙여 표시해야 한다
		 	  - 내부의 추상 메소드를 구현하기 전에는 인스턴스 생성 불가능
		 	  
		 	# 추상 메서드
		 	  - 함수의 형태만 정의해놓고 자세한 구현은 자식 클래스에서 오버라이드를 통해 구현
		 	  - 자식 클래스에서 오버라이드 하지 않으면 컴파일 에러가 발생
		 */
		// 익명클래스
		Vehicle car = new Vehicle() {
			@Override
			void ride() {
				System.out.println("즉석에서 구현한 탈것");
			}
		};
		car.ride();
		
		
		
		
	}

}

abstract class Vehicle {
	abstract void ride();
}

class Bus extends Vehicle{
	public void ride() {
		
	}
}

class Bike extends Vehicle {
	
	@Override
	void ride() {
		
	}
}