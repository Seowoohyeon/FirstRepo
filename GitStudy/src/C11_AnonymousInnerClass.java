
public class C11_AnonymousInnerClass {
	/*
	 	# 익명 내부 클래스
	 	  - 클래스에 이름을 짓지 ㅇ낳고 구현한 다음 바로 사용하는 방식
	 	  - 일회용이다
	 */
	
	public static void kick(Kickable something) {
		something.kick();
	}
	
	public static void main(String[] args) {
	/*	kick(new Human());
		kick(new Can());
		kick(new Ball("메시"));
		kick(new Ball("손흥민"));
		
		class Door extends Kickable {
			boolean open;
			
			void kick() {
				if(open) {
					System.out.println("닫힘");
					open = false;
				} else {
					System.out.println("열림");
					open = true;
				}
			}
		}
		
		Door door1 = new Door(),door2 = new Door(),door3 = new Door();
		kick(door1);
		kick(door1);
		kick(door1);
		kick(door2);
		kick(door3);
		kick(door3);
		
		// 익명 클래스 (즉석에서 Door를 상속한 인스턴스를 생성)
		kick(new Door() {
			void kick() {
				System.out.println("문이 꿈쩍도 안함");
			}
		});
		
		kick(new Ball("철수") {
			void kick() {
				System.out.println("농구공은 무겁습니다");
			}
		});*/
		
		class Punching_bag extends Punchable {
			@Override
			void punch() {
				System.out.println("강해졌습니다.");
			}
		}
		Punching_bag pb = new Punching_bag();
		punch(pb);
		
		class Face extends Punchable {
			@Override
			void punch() {
				System.out.println("코뼈가 뿌러졌습니다.");
			}	
		}
		Face face = new Face();
		punch(face);
		punch(new Face() {
			void punch() {
				System.out.println("상대방이 피했습니다.");
			}
		});
		
		punch(new Punching_bag() {
			void punch() {
				System.out.println("손목이 아픕니다.");
			}
		});
		
		
		
	}
	public static void punch(Punchable something) {
		something.punch();
	}
	
}

abstract class Punchable {
	abstract void punch();
}




abstract class Kickable {
	abstract void kick();
}

class Ball extends Kickable {
	
	String kicker;
	
	public Ball() {}
	
	public Ball(String kicker) {
		this.kicker = kicker;
	}
	
	void kick() {
		if(kicker.equals("메시")) {
			System.out.println("멋진슛");
		} else if(kicker.equals("손흥민")) {
			System.out.println("기막힌 슛");
		}
	}
}

class Human extends Kickable {
	void kick() {
		System.out.println("사람을 걷어 참");
	}
}
class Can extends Kickable {
	void kick() {
		System.out.println("깡통을 걷어 참");
	}
}




