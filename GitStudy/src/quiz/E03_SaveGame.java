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
		      	System.out.println("°¡À§ ¹ÙÀ§ º¸");
		      	System.out.println("(1.ÁÖ¸Ô 2.°¡À§  3.º¸ 4.³¡³»±â)");
		      	System.out.print("¼ýÀÚÀ» ÀÔ·Â : ");
		      	int com = 0;
		      	Random r = new Random();
		        	   
		      	int user = sc.nextInt();
		      	com = r.nextInt(3)+1;
		      	System.out.print("°á°ú : ");
		           
		      	int score = user - com;
		           
		      	if(user >= 4) {
		      		System.out.println("³¡");
		      	    break;
		      	} else {	
		      	    if(score == 0) {
		      	    	System.out.println("ºñ±è");
		      	    	n++;
		      	    	result1 = (n + "¹ø ºñ±è"); 
		      	    } else if(score == -1 || score == 2) {
		      	   		System.out.println("ÀÌ±è");
			      	   	n++;
		      	    	result2 = (n + "¹ø ÀÌ±è");
		      	    } else {
		      	   		System.out.println("Áü");
			      	   	n++;
		      	    	result3 = (n + "¹ø Áü");
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
