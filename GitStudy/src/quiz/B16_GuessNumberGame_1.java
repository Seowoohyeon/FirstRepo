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
            

            // 기본 타입 변수는 0으로 초기화
            int strike = 0, ball = 0;
            int tryCount = 0;
            int[] ran;
            
            // 참조형 변수는 null로 초기화
            String input = null;
            
            System.out.print("이름을 입력하세요 >>");
            String userName = input_scanner.nextLine();
            
            File rank = new File("./ranking/" + userName + ".wh");

            if(!(rank.exists())) {
	            for (int i = 0; i < 4; ++i) {
	                    answer_builer.append((int)(Math.random() * 10));                        
	            }                
	            String answer = answer_builer.toString();
	            
	            if (DEBUGMODE) {
	                    System.out.printf("이번 정답 [%s]\n", answer);
	            }
	            
	            
	            while (strike != 4 && tryCount != 8) {
	                    strike = 0;
	                    ball = 0;
	                    
	                    while (true) {
	                            System.out.printf("시도 %d >> ", tryCount + 1);
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
	                                    System.out.println("4자리 숫자만 입력하셔야 합니다.");
	                            }
	                    } 
	                    
	                    // strike, ball 체크
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
	             
	                    
	                    System.out.println("게임 종료!");
	                    tryCount++;
	                    System.out.println(tryCount + "번만에 맞추셨군요!!");
	                    
	                    ran = new int[al]; 
	                    
	                    
	            }
            } else if(rank.exists()) {
            	FileInputStream fin;
        		DataInputStream din;
            	try {
            		fin = new FileInputStream(rank);
            		din = new DataInputStream(fin);
            		
            		
            		tryCount = din.read();
            		

            		System.out.println("이미 참가 했던 분이시군요?");
            		System.out.println("아쉽지만 재도전은 불가능 합니다ㅠㅠㅠ");
            		System.out.printf("불러온 정보 - %d번만에 맞추셨군요~!!\n당신의 순위는"
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
