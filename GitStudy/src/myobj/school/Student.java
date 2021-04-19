package myobj.school;

import java.util.Random;

public abstract class Student {
	final static String[] lastname = {"김","나","박","이","최","서","최","장","정","강"};
	final static String[] firstname = {"우현","길수","병훈","현준","예나","예림","예지","해린",
			"서혁","현주","지우","재욱","민석"};
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
