
public class C04_Static {

	/*
		 # Static (���� ����, Ŭ���� ���� <=> �ν��Ͻ� ����)
		 	- ����ƽ������ Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� �����̴�
		 	- �տ� ����ƽ�� ���� Ŭ������ �ڿ��� ��� �ν��Ͻ����� ���� ���� ���ϰ� �ȴ�
		 	- ����ƽ ������ Ŭ������ �ϳ��ۿ� �������� �����Ƿ� �޸𸮰� ����ȴ�
		 	- ����ƽ ������ Ŭ������ �ϳ��̱� ������ Ŭ������ .�� ��� ����ϴ� ���� ����
		 	- ����ƽ ������ �ڿ��� �ν��Ͻ��� ����� ������ ȣ���� �� �ִ�.
		 	- �ν��Ͻ��� �������� ���� ���� ����ƽ�� ���� ���ɼ��� �ֱ� ������ ����ƽ �޼��忡���� �ν��Ͻ� �ڿ��� ����� �� ����
	 */
	public static void main(String[] args) {
		
		// ���� ������ �ν��Ͻ��� ������ ����ƽ �ڿ��� ����� �� �ִ�
		// ����ƽ �ڿ��� Ŭ������ .�� ��� ������ �� �ִ�.
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
	// ������ ������ ��� �������� �ʺ�� ���̴� �����ϴ�
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












