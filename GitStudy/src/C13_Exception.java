import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class C13_Exception {
	/*
	 
	 	# Exception(����)
	 	
	 	  - �츮�� ������� �˰� �ִ� ���� �۾����� ��� ���ܶ�� �θ���
	 	  - ���α׷��Ӱ� �߻� ������ ���ܸ� �̸� �����ϰ� ����صδ� ���� ����ó����� �Ѵ�
	 	  - �ڹ��� ������ �s���� ���� ���ܰ� �ƴ϶� ������ ������� �θ���(��Ÿ ��)
	 	  - ���α׷��Ӱ� ���ܿ� ���Ͽ� ������ ��ġ�� �����شٸ� ���α׷��� ���� �������� �ʰ� ����ؼ� ������ �� �ִ�
	 	  - �޼ҵ忡 ���콺�� �÷����� � ���ܰ� � ��Ȳ�� �߻��ϴ����� ���� ������ �����ִ�
	 	  
	 	# ����ó��
	 	
	 	  - ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��
	 	  - try�� ���ο� �ִ� �ڵ�� ���ܰ� �߻����� ������ ��� ���� ����ȴ�
	 	  - try�� ���ο��� ���ܰ� �߻��ϴ� ��� ������ ��� �ߴܵǰ� �ش� ���ܸ� ����ϴ� catch������ �̵��ϰ� �ȴ�
	 	  - catch������ �߻��� ���ܷ� ���� ������ ��� �ִ� �ν��Ͻ��� �����ϰ� �ȴ�
	 	  - catch���� ������ ��ø�ؼ� ����� �� �ִ�.
	 	  - ���ܰ� �߻��ϵ� ���ϵ� �����ϰ� ���� �ڵ�� finally�� �ۼ��Ѵ�
	 	  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("�ݵ�� ���ڸ� �Է����ּ��� : ");
		try {
			a = sc.nextInt();
		} catch (InputMismatchException e) {
		//	e.printStackTrace(); // ������ ���� ���� ���
		//	System.out.println("getMessage : " + e.getMessage());
			System.out.println("�̻��Ѱ� �Է���");
			a = -1;
			return;
		} catch (IllegalStateException e) {
			System.out.println("��ĳ�� ��������");
			a = -1;
		} catch (NoSuchElementException e) {
			System.out.println();
			a = -1;
		} finally {
			System.out.println("Fucking Good!!!!");
		}
		
		System.out.println("�Է��Ͻ� ���� : " + a);
		System.out.println("���������� ���α׷� ����");
	
	
	}
}
