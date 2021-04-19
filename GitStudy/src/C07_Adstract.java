
public class C07_Adstract {

	public static void main(String[] args) {
		/*
		 	# �߻� Ŭ����
		 	  - �ϼ��� �ڽ� Ŭ�������� �̷�� Ŭ����
		 	  - Ŭ���� ���ο� �߻� �޼��带 ���� Ŭ������ �տ� abstract�� �ٿ� ǥ���ؾ� �Ѵ�
		 	  - ������ �߻� �޼ҵ带 �����ϱ� ������ �ν��Ͻ� ���� �Ұ���
		 	  
		 	# �߻� �޼���
		 	  - �Լ��� ���¸� �����س��� �ڼ��� ������ �ڽ� Ŭ�������� �������̵带 ���� ����
		 	  - �ڽ� Ŭ�������� �������̵� ���� ������ ������ ������ �߻�
		 */
		// �͸�Ŭ����
		Vehicle car = new Vehicle() {
			@Override
			void ride() {
				System.out.println("�Ｎ���� ������ Ż��");
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