
public class C05_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	# Ŭ���� ���
		 	  - �̹� �����ϴ� Ŭ������ �״�� �����ްų� ���ļ� ����ϴ°�
		 	  - ������ִ� Ŭ������ �θ� Ŭ���� �Ǵ� ���� Ŭ������� �Ѵ�
		 	  - ��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� ����Ŭ������� �Ѵ� 
		 	  
		 */
		 
		Person[] ps = new Person[3];
		
		ps[0] = new Person("ȫ�浿", 10, 10);
		ps[1] = new Person("��浿", 55, 15);
		ps[2] = new Person("�̱浿", 30, 12);
		
		ps[0].sayHi();
		ps[1].sayHi();
		ps[2].sayHi();
		
		// �θ�Ŭ�������� ������� ����� �����Ӱ� ��� ����
		Police po = new Police();
		po.sayHi();
		po.run();
		po.walk();
		
		po.thisSuperTest("�Ѹ�");

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
			System.out.println("��ȿ���� ���� ���� �Դϴ�.");
		} else if(age <= 25) {
			System.out.printf("�ȳ� �̸��� %s �̰� ���̴� %d�� �̾�\n ", name, age);
		} else if(age <= 45) {
			System.out.printf("�ȳ��ϼ��� �̸��� %s �̰� ���̴� %d�� �Դϴ�\n", name, age);
		} else {
			System.out.printf("�ݰ����ϴ� �̸��� %s �̰� ���̴� %d�� �Դϴ�\n", name, age);
		}
	}
	
	void walk() {
		System.out.printf("%s���� �ѹ� ������ &d���� �����Դϴ�\n", name, speed /2);
	}
	
	void run() {
		System.out.printf("%s���� %d���� �پ����ϴ�\n", name, speed);
	}
	
}

/*
 	��� �޴� Ŭ������ �����ڿ��� ���� ���� �θ��� �����ڸ� ȣ���ؾ� �Ѵ�
 	�θ� Ŭ������ �⺻�����ڰ� �����ϸ� ������ �� ������, �������� �������� ���� �Ұ�
 	�ڽ� Ŭ������ �θ��� �޼ҵ带 ������� ���Ļ�� ����(�������̵�)
 	�θ� Ŭ������ �ڽ� Ŭ������ �Ȱ��� �̸��� ���� �ڿ��� �ִ°�� ���ۿ� �𽺷� ��Ȯ�ϰ� ���� ����
*/

class Police extends Person {
	// �ڽ� Ŭ������ �����ڿ����� ù �ٿ� ���۸� �ݵ�� ȣ���ؾ� �Ѵ�(�ʼ�)
	String name = "������";
	
	
	public Police(){
		super("�����", 27, 20);
		//���۴� �θ� Ŭ������ ������ ȣ���� �� ���
	}
	
	@Override
	void sayHi() {
		System.out.printf("�ȳ��Ͻʴϱ� ���� %s ���� �Դϴ�\n", name);
	}
	
	void thisSuperTest(String name) {
		System.out.println("�׳� name : " + name);
		System.out.println("this.name : " + this.name);
		System.out.println("super.name : " + super.name);
	}
	 
	void arrest(String suspect) {
		System.out.printf("%s����� ������ %s���� ü���߽��ϴ�", name, suspect);
	}
}

/*	class Programmer extends Police {
	// ��� �����ڸ� ������ ��
	// �ڽ� Ŭ�������� �⺻ �����ڰ� ���⵵ �θ� Ŭ������ �⺻ �����ڸ� ����Ѵ�
} */






















