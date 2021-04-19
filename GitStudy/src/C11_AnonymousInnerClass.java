
public class C11_AnonymousInnerClass {
	/*
	 	# �͸� ���� Ŭ����
	 	  - Ŭ������ �̸��� ���� ������ ������ ���� �ٷ� ����ϴ� ���
	 	  - ��ȸ���̴�
	 */
	
	public static void kick(Kickable something) {
		something.kick();
	}
	
	public static void main(String[] args) {
	/*	kick(new Human());
		kick(new Can());
		kick(new Ball("�޽�"));
		kick(new Ball("�����"));
		
		class Door extends Kickable {
			boolean open;
			
			void kick() {
				if(open) {
					System.out.println("����");
					open = false;
				} else {
					System.out.println("����");
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
		
		// �͸� Ŭ���� (�Ｎ���� Door�� ����� �ν��Ͻ��� ����)
		kick(new Door() {
			void kick() {
				System.out.println("���� ��½�� ����");
			}
		});
		
		kick(new Ball("ö��") {
			void kick() {
				System.out.println("�󱸰��� ���̽��ϴ�");
			}
		});*/
		
		class Punching_bag extends Punchable {
			@Override
			void punch() {
				System.out.println("���������ϴ�.");
			}
		}
		Punching_bag pb = new Punching_bag();
		punch(pb);
		
		class Face extends Punchable {
			@Override
			void punch() {
				System.out.println("�ڻ��� �ѷ������ϴ�.");
			}	
		}
		Face face = new Face();
		punch(face);
		punch(new Face() {
			void punch() {
				System.out.println("������ ���߽��ϴ�.");
			}
		});
		
		punch(new Punching_bag() {
			void punch() {
				System.out.println("�ո��� ���Ŵϴ�.");
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
		if(kicker.equals("�޽�")) {
			System.out.println("������");
		} else if(kicker.equals("�����")) {
			System.out.println("�⸷�� ��");
		}
	}
}

class Human extends Kickable {
	void kick() {
		System.out.println("����� �Ⱦ� ��");
	}
}
class Can extends Kickable {
	void kick() {
		System.out.println("������ �Ⱦ� ��");
	}
}




