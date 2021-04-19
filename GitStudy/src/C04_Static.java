
public class C04_Static {

	/*
		 # Static (정적 영역, 클래스 영역 <=> 인스턴스 영역)
		 	- 스태틱은같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역이다
		 	- 앞에 스태틱이 붙은 클래스의 자원은 모든 인스턴스에서 같은 값을 지니게 된다
		 	- 스태틱 영역은 클래스당 하나밖에 생성되지 않으므로 메모리가 절약된다
		 	- 스태틱 영역은 클래스당 하나이기 때문에 클래스명에 .을 찍고 잡근하는 것이 좋다
		 	- 스테틱 영역의 자원은 인스턴스가 생기기 전에도 호출할 수 있다.
		 	- 인스턴스가 존재하지 않을 때도 스태틱이 사용될 가능성이 있기 때문에 스태틱 메서드에서는 인스턴스 자원을 사용할 수 없다
	 */
	public static void main(String[] args) {
		
		// 아직 생성된 인스턴스가 없더라도 스태틱 자원을 사용할 수 있다
		// 스태틱 자원은 클래스명에 .을 찍고 접근헐 수 있다.
		System.out.println(Lamp.width);
		System.out.println(Lamp.height);
		
		Lamp lamp01 = new Lamp();
		Lamp lamp02 = new Lamp();
		Lamp lamp03 = new Lamp();
		Lamp lamp04 = new Lamp();

		lamp03.width = 30;
		
		System.out.println(lamp01.width);
		System.out.println(lamp02.width);
		System.out.println(lamp03.width);
		System.out.println(lamp04.width);
	}

}

class Lamp {
	// 강의장 내부의 모든 형광등의 너비와 높이는 일정하다
	static int width = 50;
	static int height = 200;
	
	int[] position;
	double brightness;
	boolean powerOn;
	
	static void changeWidth(int width) {
		Lamp.width = width;
	}
	
	/*static void turnOn() {
		this.powerOn = true;
	}*/
}












