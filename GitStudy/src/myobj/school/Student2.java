package myobj.school;

import java.util.Random;

//��������� ���� �ʿ䰡 �����Ƿ� private
public class Student2 {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	private static Random ran = new Random(); 
	private static int sno = 0;
	
	public static int BEST_TOTAL = 0;
	
	private static int getRandomScore() {
		return ran.nextInt(101); // Math.random() * 101 �� ����
	}
	
	
	public Student2() {
		kor = getRandomScore();
		eng = getRandomScore();
		math = getRandomScore();
		name = String.format("�л�%06d", sno++); // %06d : �տ� 0�� 6�� ���δ�
		BEST_TOTAL = (int)Math.max(getTotal(), BEST_TOTAL);
		//int total = getTotal();
		//BEST_TOTAL = getTotal() > BEST_TOTAL ? getTotal() : BEST_TOTAL; 
	}
	
	public int getTotal() { //������ ���ϴ� �޼���
		return kor + eng + math;
	}
	
	public double getAvg() {	//����� ���ϴ� �޼���
		return getTotal() / 3.0;
	}
	
	public String getTranscript() { // ����ǥ�� ����ϴ� �޼���
		return String.format("%s\t/ %d\t/ %.2f", name, getTotal(), getAvg()); 
		//prinf�� ��������� format�� ���ڿ��� '����'��(���ڿ��� ����� �Լ�)
	}
	
}














