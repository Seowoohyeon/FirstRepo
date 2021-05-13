package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class B16_GuessNumberGame_1 {

	public static void main(String[] args) {
		{
            final boolean DEBUGMODE = true;
            
            StringBuilder answer_builer = new StringBuilder();
            Scanner input_scanner = new Scanner(System.in);
            ArrayList al = new ArrayList();
            

            // �⺻ Ÿ�� ������ 0���� �ʱ�ȭ
            int strike = 0, ball = 0;
            int tryCount = 0;
            int[] ran;
            
            // ������ ������ null�� �ʱ�ȭ
            String input = null;
            
            System.out.print("�̸��� �Է��ϼ��� >>");
            String userName = input_scanner.nextLine();
            
            File rank = new File("./ranking/" + userName + ".wh");

            if(!(rank.exists())) {
	            for (int i = 0; i < 4; ++i) {
	                    answer_builer.append((int)(Math.random() * 10));                        
	            }                
	            String answer = answer_builer.toString();
	            
	            if (DEBUGMODE) {
	                    System.out.printf("�̹� ���� [%s]\n", answer);
	            }
	            
	            
	            while (strike != 4 && tryCount != 8) {
	                    strike = 0;
	                    ball = 0;
	                    
	                    while (true) {
	                            System.out.printf("�õ� %d >> ", tryCount + 1);
	                            input = input_scanner.nextLine();
	                            
	                            boolean valid = true;
	                            
	                            if (input.length() != 4) {
	                                    valid = false;
	                            }                                
	                            
	                            for (int i = 0; valid && i < 4; ++i) {
	                                    if (input.charAt(i) < '0' || input.charAt(i) > '9') {
	                                            valid = false;
	                                    }
	                            }
	                            
	                            if (valid) {
	                                    break;
	                            } else {
	                                    System.out.println("4�ڸ� ���ڸ� �Է��ϼž� �մϴ�.");
	                            }
	                    } 
	                    
	                    // strike, ball üũ
	                    if (answer.equals(input)) {
	                            strike = 4;
	                    } else {
	                            for (int i = 0; i < 4; ++i) {                                        
	                                    
	                                    for (int j = 0; j < 4; ++j) {                                                
	                                            if (answer.charAt(i) == input.charAt(j)) {                                                        
	                                                    if (i == j) {
	                                                            strike++;
	                                                            
	                                                    } else {
	                                                            ball++;
	                                                    }
	                                                    break;
	                                            }                                                
	                                    }                                        
	                            }
	                    }
	                    System.out.printf("%d strike, %d ball!\n", strike, ball);
	             
	                    
	                    System.out.println("���� ����!");
	                    tryCount++;
	                    System.out.println(tryCount + "������ ���߼̱���!!");
	                    
	                    ran = new int[al]; 
	                    
	                    
	            }
            } else if(rank.exists()) {
            	FileInputStream fin;
        		DataInputStream din;
            	try {
            		fin = new FileInputStream(rank);
            		din = new DataInputStream(fin);
            		
            		
            		tryCount = din.read();
            		

            		System.out.println("�̹� ���� �ߴ� ���̽ñ���?");
            		System.out.println("�ƽ����� �絵���� �Ұ��� �մϴ٤ФФ�");
            		System.out.printf("�ҷ��� ���� - %d������ ���߼̱���~!!\n����� ������"
            				, tryCount);
            		
            		fin.close();
            	} catch (FileNotFoundException e1) {
            		// TODO Auto-generated catch block
            		e1.printStackTrace();
            	} catch (IOException e) {
            		// TODO Auto-generated catch block
            		e.printStackTrace();
            	}
            }

            
            try {
				FileOutputStream fout = new FileOutputStream(rank);
				DataOutputStream dos = new DataOutputStream(fout);
				
				
				dos.write(tryCount);
				
				fout.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
    
    
}}
