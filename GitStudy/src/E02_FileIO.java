import java.io.File;

public class E02_FileIO {
	
	/*
	 	# java.util.File
	 	
	 	  - ���� �ý����� ���� ������ ���� �� �ִ� Ŭ����
	 */
	
	public static void main(String[] args) {
		// �����ڷ� ��� ����
		File a = new File("wd.txt");
		File d = new File("xd.txt");
		File dir = new File("D:/aaa/");
		File dir2 = new File("D:/images/");
		
		
		System.out.println("�б� ������ �ִ� �����ΰ���? " + a.canRead());
		System.out.println("���� ���� �ִ� �����ΰ���? " + a.canExecute());
		System.out.println("���� ���� �ִ� �����ΰ���? " + a.canWrite());
		
		// ���� ��� �˾ƿ���
		System.out.println(a.getAbsolutePath());
		
		// a�� ��� ��ΰ� ���� ��� �ΰ�
		System.out.println(a.isAbsolute());
		
		// a�� ��� ���� �ν��Ͻ��� ���丮�ΰ�?
		System.out.println("is a a directory? " + a.isDirectory());
		System.out.println("is dir a directory? " + dir.isDirectory());
		
		System.out.println("a�� ���� ���� �ϴ°�? " + a.exists());
		System.out.println("dir�� ���� ���� �ϴ°�? " + dir.exists());
		System.out.println("dir2�� ���� ���� �ϴ°�? " + dir2.exists());
		
		if(!dir2.exists()) {
			dir2.mkdir();
		} else {
			System.out.println("�̹� �����ϴ� ���丮�Դϴ�");
		}
		
		// ���� 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
