package quiz;

import java.util.ArrayList;
import java.util.Random;

import myobj.school.Student2;

public class D01_StudentList {
	
	//학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
	// 1. 각 학생의 점수는 랜덤으로 설정됨
	// 2. 과목은 국/영/수 뿐임
	// 3. 30명의 평균을 출력
	// 4. 30명 중 가장 총점이 높은 학생의 이름과 성적을 ㅊ출력
	// 5. 이름은 다음과 같이 생성 ( 학생000000, 학생000001, 학생000002...)

	public static void main(String[] args) {
		
		ArrayList<Student2> clazz = new ArrayList<>();
		
		for(int i = 0; i < 30; ++i) {
			Student2 stu = new Student2();
			clazz.add(stu);
			System.out.println(stu.getTranscript());
		}
		System.out.println("----- 최고 점수 학생 -----");
		for(Student2 student : clazz) { //학생을 하나씩 꺼냄
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
			student.add("학생00000"+ (i + 1));
			
			
		}
		
		
		
		
		
		System.out.println(student);
		System.out.println(kor);
	}
	
	
	*/
	
	
