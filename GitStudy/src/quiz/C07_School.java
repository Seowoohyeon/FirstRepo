package quiz;

import myobj.school.*;


public class C07_School {
	int sno;
	
	public C07_School() {
		sno = 100000;
		
		Student[] program = new Student[30];
		Student[] network = new Student[30];
		Student[] machinelearning = new Student[30];
		
		for(int i = 0; i < program.length; ++i) {
			program[i] = new ProgrammingStudent(sno++);
			program[i].printGradeCard();
		}
		System.out.println("\n\n");
		for(int i = 0; i < network.length; ++i) {
			network[i] = new NetworkStudent(sno++);
			network[i].printGradeCard();
		}
		System.out.println("\n\n");
		for(int i = 0; i < machinelearning.length; ++i) {
			machinelearning[i] = new MachinelearningStudent(sno++);
			machinelearning[i].printGradeCard();
		}
		
	}
	
	public static void main(String[] args) {
		
		new C07_School();
		
		/*for(int i = 0; i < program.length; ++i) {
			program[i] = new ProgrammingStudent();
			program[i].printGradeCard();
		}*/
		
	}
	
	
	
}


