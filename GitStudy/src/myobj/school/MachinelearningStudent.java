package myobj.school;

public class MachinelearningStudent extends Student {
	final static String[] sub = {"국어","영어","수학","통계학"};
	int math;
	int pl;
	
	public MachinelearningStudent(int sno) {
		super(sno);
		math = getRandomScore();
		pl = getRandomScore();
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("머신러닝 반");
		System.out.printf("락번\t이름\t%s\t%s\t%s\t%s\t총점\t평균\n",
				sub[0],sub[1],sub[2],sub[3]);
		System.out.printf("%X\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
				sno,name,kor,eng,math,pl, kor+eng+math+pl, (kor+eng+math+pl) / 4.0);
		System.out.println("----------------------------------------------------------------------");
	}
	
	
	
}
