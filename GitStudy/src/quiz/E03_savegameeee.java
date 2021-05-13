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
      
      System.out.print("�̸��� �Է��ϼ��� >>");
      String userName = sc.nextLine();
      
      File save = new File("./data/" + userName + ".wh");
      
      if(save.exists()) {
         System.out.println("�ҷ��� ������ �ֽ��ϴ�");
         
         try {
            FileInputStream fin = new FileInputStream(save);
            
            win = fin.read();
            lose = fin.read();
            
            System.out.printf("�ҷ��� ���� - %d�� %d��\n", win, lose);
            
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         }
         
      } else {
         System.out.println("�ҷ��� ������ �����ϴ�");
      }
      
      while (true) {
         int answer = (int)(Math.random() * 2);
         
         System.out.println("0, 1 >");
         int user = sc.nextInt();
         
         if(user != -1 && user != 0 && user != 1) {
            System.out.println("�ٽ� �Է��ϼ���");
            continue;
         }
         
         if(user == -1) {
            System.out.println("�÷������ּż� �����մϴ�");
            break;
         }
         
         if(user != answer) {
            lose++;
            System.out.println("�����ϴ�");
         } else { 
            win++;
            System.out.println("�̰���ϴ�");
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

