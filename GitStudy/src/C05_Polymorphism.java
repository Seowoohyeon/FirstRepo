
public class C05_Polymorphism {
	/*
	 	@ ������
	 		- ��ü�� �پ��� ���¸� ���� �� �ִ�
	 		- ����� ����̱⵵ �ϰ� �����̱⵵ �ϴ�
	 		- ������ ���������� ����� �ƴϴ�
	 		
	 	# �ڽ� Ŭ������ �θ� Ŭ������ �� �� �ִ�
	 		- �ڽ� Ŭ���� Ÿ���� �θ� Ŭ���� Ÿ���� �Ǵ� ���� ��ĳ�����̶�� �Ѵ�
	 		- �� ĳ���õ� ��ü�� �ڽ� Ŭ�������� �����ϴ� �͵��� ��� �ؾ����
	 		- �������̵�� �޼ҵ�� �ڽ� Ŭ�������� ������ ������ ����ȴ�
	 		
	 	# �θ� Ŭ������ �ڽ� Ŭ������ �� �� �ִ�(�ٿ� ĳ����)
	 		- ������ ���������� ��ĳ���� �Ǿ��� �ν��Ͻ���
	 		    �ٽ� ���� Ÿ�������� �ٿ� ĳ������ �����ϴ�
	 */
	public static void main(String[] args) {
		new Food(new PigMeat(), new Vege(), new Balsamic());
		
		MainMaterial main_mat = new MainMaterial();
		MainMaterial main_mat2 = new Meat();
		
		Police p1 = new Police();
		p1.sayHi();
		p1.arrest("�谭��");
		
		// person���� ��ĳ���õ� police�� ü���� �� �� ����
		Person person = p1;
		Person person2 = new Person("����ġ",20,10);
		// person.arrest;
		person.sayHi();
		
		// �ٿ� ĳ������ Ȱ���� ���� ��� �ٽû��
		((Police)person).arrest("��Ҹ�"); // �������� �̾��� �ν��Ͻ��� �ٿ�ĳ������ ����
		((Police)person2).arrest("�赵��"); // ������ �ƴϿ��� �ν��Ͻ��� �ٿ�ĳ���� �Ұ�
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
// ���� ���� �θ�
class MainMaterial {}
class SubMaterial {}
class Sauce {}

// ����� ���
class Fish extends MainMaterial {}
class Meat extends MainMaterial {}

// ����Ḧ ��ӹ��� Ŭ������ ���
class PigMeat extends Meat {}

// ����� ���
class Vege extends SubMaterial{}
class Fruit extends SubMaterial{}

// �ҽ����
class Salsa extends Sauce{}
class Balsamic extends Sauce{}









