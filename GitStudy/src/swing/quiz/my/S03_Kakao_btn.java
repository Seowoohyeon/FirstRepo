package swing.quiz.my;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;



public class S03_Kakao_btn extends JFrame {
   
   
   public S03_Kakao_btn() throws IOException {
   
	   int x = 10, y = 20, w = 200, h= 200;   
	   int x2 = 180, y2 = 20, w2 = 200, h2 = 200;
	   int x3 = 10, y3 = 190, w3 = 200, h3 = 200;
	   int x4 = 180, y4 = 190, w4 = 200, h4 = 200;
	   
	   Image kakao = ImageIO.read(new File("./data/kakao.jpg"));   
	   
	   BufferedImage dst = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	   dst.getGraphics().drawImage(kakao, 0, 0, w, h, x, y, x + w, y + h, null);
	   
	   BufferedImage dst2 = new BufferedImage(w2, h2, BufferedImage.TYPE_INT_ARGB);
	   dst2.getGraphics().drawImage(kakao, 0, 0, w2, h2, x2, y2, x2 + w2, y2 + h2, null);
	   
	   BufferedImage dst3 = new BufferedImage(w3, h3, BufferedImage.TYPE_INT_ARGB);
	   dst3.getGraphics().drawImage(kakao, 0, 0, w3, h3, x3, y3, x3 + w3, y3 + h3, null);
	   
	   BufferedImage dst4 = new BufferedImage(w4, h4, BufferedImage.TYPE_INT_ARGB);
	   dst4.getGraphics().drawImage(kakao, 0, 0, w4, h4, x4, y4, x4 + w4, y4 + h4, null);
	   
	   
	   GridLayout gout = new GridLayout(2, 2);
	   setLayout(gout);
	   
	   
	         
	   JButton b1 = new JButton("라이언");
	   JButton b2 = new JButton("어피치");
	   JButton b3 = new JButton("무지");
	   JButton b4 = new JButton("오리?");
	   
	   add(b1);
	   add(b2);
	   add(b3);
	   add(b4);
	   
	   b1.setBackground(Color.white);
	   b2.setBackground(Color.white);
	   b3.setBackground(Color.white);
	   b4.setBackground(Color.white);
	   
	   b1.setIcon(new ImageIcon(dst));
	   b2.setIcon(new ImageIcon(dst2));
	   b3.setIcon(new ImageIcon(dst3));
	   b4.setIcon(new ImageIcon(dst4));
	   
	   b1.setBounds(50, 50, 100, 100);
	   b2.setBounds(100, 100, 100, 100);
	   b2.setBounds(150, 150, 100, 100);
	   b2.setBounds(200, 200, 100, 100);
	   
	   b1.setOpaque(false);
	   b2.setOpaque(false);
	   b3.setOpaque(false);
	   b4.setOpaque(false);
	   
	   
	   setLocation(200,100);
	   setSize(300,300);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setVisible(true);
	   
	   
	   
	   
	   
   }
   public static void main(String[] args) throws IOException {
	   
	   
      new S03_Kakao_btn();
      
   }
   
   
   
}
