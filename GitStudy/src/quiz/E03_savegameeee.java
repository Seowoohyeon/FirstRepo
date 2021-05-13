package quiz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E03_savegameeee {

   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int win = 0;
      int lose = 0;
      
      System.out.print("이름을 입력하세요 >>");
      String userName = sc.nextLine();
      
      File save = new File("./data/" + userName + ".wh");
      
      if(save.exists()) {
         System.out.println("불러올 파일이 있습니다");
         
         try {
            FileInputStream fin = new FileInputStream(save);
            
            win = fin.read();
            lose = fin.read();
            
            System.out.printf("불러온 정보 - %d승 %d패\n", win, lose);
            
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         }
         
      } else {
         System.out.println("불러올 파일이 없습니다");
      }
      
      while (true) {
         int answer = (int)(Math.random() * 2);
         
         System.out.println("0, 1 >");
         int user = sc.nextInt();
         
         if(user != -1 && user != 0 && user != 1) {
            System.out.println("다시 입력하세요");
            continue;
         }
         
         if(user == -1) {
            System.out.println("플레이해주셔서 감사합니다");
            break;
         }
         
         if(user != answer) {
            lose++;
            System.out.println("졌습니다");
         } else { 
            win++;
            System.out.println("이겼습니다");
         }
         
      }
      
      try {
         FileOutputStream fout = new FileOutputStream(save);
         
         
         fout.write(win);
         fout.write(lose);

      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
      
   }
}

