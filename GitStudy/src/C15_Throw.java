import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class C15_Throw {

	/*
	 	# throw
	 	
	 		- ���ϴ� ���ܸ� �߻���Ų��
	 		
	 	# throws
	 	
	 		- �ش�޼��忡�� �̷��� ���ܵ��� �߻���Ų�ٴ� ���� �˸���
	 		- �ش� �޼��带 ȣ���ϴ� ���� ��� ���� �� �ִ�
	 		- ���ܿ� ���� ó���� ȣ���ϴ� ������ �̷��.
	 	
	 	# Exception 
	 		- Ŭ������ ��ӹ��� ���ܴ� �ݵ�� ó���ؾ� �ϴ� ���ܰ� �ȴ�
	 		- ����ó���� �� ��쿡�� �������� ������ش�
	 		
	 	# RunException Ŭ������ ��ӹ��� ���ܴ� �ݵ�� ó������ �ʾƵ� �Ǵ� ���ܰ� �ȴ�
	 		- InputMismathException... ��
	 		- ����ó���� ���� �ʾƵ� ������ ������ �߻����� �ʴ� ���ܵ�
	 		
	 */	
	public static void main(String[] args) {
	//	new C15_Throw().dangerous_method();
		C15_Throw instance = new C15_Throw();
		
		try {
			instance.dangerous_method();
			instance.dangerous_method2();
		} catch (FileNotFoundException e) {
			System.out.println("���� ��ã��");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� " + e.getMessage());
		} 
		
		try {
			instance.checkEven(20);
			instance.checkOdd(10);
		} catch (NotEvenException e) {
			System.out.println("¦�� �ƴ� �ͼ���");
		} catch (NotOddException e) {
			System.out.println("Ȧ�� �ƴ� �ͼ���");
		}
		
		
		System.out.println("���α׷� ���� ����");
	}
	
	public void dangerous_method() throws FileNotFoundException {
		// ������ ������ �о���� ���� �غ� ���� (�� ó���ؾ� �ϴ� ���ܰ� �߻�)
		File f = new File("C:\\Users\\sexys\\OneDrive\\���� ȭ��\\����\\ssss.txt");
			FileReader reader = new FileReader(f);
	
	}
	
	public void dangerous_method2() {
		throw new ArrayIndexOutOfBoundsException("�׳� �������");
	}
	
	public void checkEven(int num) throws NotEvenException {
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�");			
		} else {
			throw new NotEvenException();
		}
		
		System.out.println("checkEven()�� ���� ����");
	}
	
	public void checkOdd(int num) {
		if(num % 2 == 1) {
			System.out.println("Ȧ���Դϴ�");			
		} else {
			throw new NotOddException();
		}
		
		System.out.println("checkOdd()�� ���� ����");
	}

}
// ¦���� �ƴҶ� �߻���ų ���� (����ó�� ���� ������ ������ �Ұ�)
class NotEvenException extends Exception {
	public NotEvenException () {
		super("¦���� �ƴϾ �߻���ų ����");
	}
}

//Ȧ���� �ƴҶ� �߻���ų ���� (����ó�� ���� �ʾƵ� �������� ���� �ʴ� ����)
class NotOddException extends RuntimeException{
	public NotOddException() {
		super("Ȧ���� �ƴϾ �߻���ų ����");
	}
}












