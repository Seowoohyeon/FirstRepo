package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class E03_SaveGame {
	public static void main(String[] args) {
			   
		File file  = new File("C:\\Users\\1103-24\\git\\FirstRepo1\\GitStudy\\src\\note\\Acc.text");
		String result1 = null;
		String result2 = null;
		String result3 = null;
		int n = 0;
		try {
			while(true) {
		      	Scanner sc = new Scanner(System.in);
		      	System.out.println("==========================");
		      	System.out.println("���� ���� ��");
		      	System.out.println("(1.�ָ� 2.����  3.�� 4.������)");
		      	System.out.print("������ �Է� : ");
		      	int com = 0;
		      	Random r = new Random();
		        	   
		      	int user = sc.nextInt();
		      	com = r.nextInt(3)+1;
		      	System.out.print("��� : ");
		           
		      	int score = user - com;
		           
		      	if(user >= 4) {
		      		System.out.println("��");
		      	    break;
		      	} else {	
		      	    if(score == 0) {
		      	    	System.out.println("���");
		      	    	n++;
		      	    	result1 = (n + "�� ���"); 
		      	    } else if(score == -1 || score == 2) {
		      	   		System.out.println("�̱�");
			      	   	n++;
		      	    	result2 = (n + "�� �̱�");
		      	    } else {
		      	   		System.out.println("��");
			      	   	n++;
		      	    	result3 = (n + "�� ��");
		      	    }
		      	}
		      	FileOutputStream acc = new FileOutputStream(file);
		      	byte[] con1 = result1.getBytes();
		      	byte[] con2 = result2.getBytes();
		      	byte[] con3 = result3.getBytes();
		      	acc.write(con1);
		      	acc.write(con2);
		      	acc.write(con3);
		      	acc.flush();
		      	acc.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
