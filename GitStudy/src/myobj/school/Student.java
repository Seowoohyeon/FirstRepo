package myobj.school;

import java.util.Random;

public abstract class Student {
	final static String[] lastname = {"��","��","��","��","��","��","��","��","��","��"};
	final static String[] firstname = {"����","���","����","����","����","����","����","�ظ�",
			"����","����","����","���","�μ�"};
	String name;
	int kor;
	int sno;
	int eng;
	Random ran;
	
	public Student(int sno) {
		this.sno = sno;
		ran = new Random();
		kor  = getRandomScore();
		eng  = getRandomScore();
		name = getRandomName();
	}
	
	public abstract void printGradeCard();
	
	int getRandomScore() {
		return ran.nextInt(101);
	}
	
	String getRandomName() {
		return lastname[ran.nextInt(lastname.length)]+firstname[ran.nextInt(firstname.length)];
	}
	
}
