package quiz;

import java.util.ArrayList;
import java.util.Random;

import myobj.school.Student2;

public class D01_StudentList {
	
	//�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	// 1. �� �л��� ������ �������� ������
	// 2. ������ ��/��/�� ����
	// 3. 30���� ����� ���
	// 4. 30�� �� ���� ������ ���� �л��� �̸��� ������ �����
	// 5. �̸��� ������ ���� ���� ( �л�000000, �л�000001, �л�000002...)

	public static void main(String[] args) {
		
		ArrayList<Student2> clazz = new ArrayList<>();
		
		for(int i = 0; i < 30; ++i) {
			Student2 stu = new Student2();
			clazz.add(stu);
			System.out.println(stu.getTranscript());
		}
		System.out.println("----- �ְ� ���� �л� -----");
		for(Student2 student : clazz) { //�л��� �ϳ��� ����
			if(student.getTotal() == Student2.BEST_TOTAL) {
				System.out.println(student.getTranscript());
			}
			
		}
		
	}	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		
		int kor = (int)(Math.random() * 101);
		int eng = (int)(Math.random() * 101);
		int math = (int)(Math.random() * 101);
		ArrayList<String> student = new ArrayList<>();
		ArrayList<Integer> kor_score = new ArrayList<>();
		
		
		for(int i = 0; i < 30; i++) {
			student.add("�л�00000"+ (i + 1));
			
			
		}
		
		
		
		
		
		System.out.println(student);
		System.out.println(kor);
	}
	
	
	*/
	
	
