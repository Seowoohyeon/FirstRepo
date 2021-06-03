package swing.quiz.my;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.*;

public class S02_Lotto2 extends JFrame implements ActionListener{
	JFrame frame = new JFrame("Lotto");
    JButton num_btn = new JButton();
    JButton btn1 = new JButton("가즈아");
    Font font1 = new Font("맑은고딕", Font.BOLD, 20);
    Font font2 = new Font("맑은고딕", Font.BOLD, 20);
    
    HashSet<Integer> lotto = lotto_set();
	
	public S02_Lotto2() {
		btn1.setFont(font1);
	      btn1.setLocation(300, 300);
	      btn1.setSize(150, 50);
	 
	      
	      num_btn.setFont(font2);
	      num_btn.setLocation(100, 100);
	      num_btn.setSize(300, 100);
	      
	      frame.setVisible(true);
	      frame.setLocation(200, 50);
	      frame.setLayout(null);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(500, 500);
	      
	      frame.add(btn1);
	      frame.add(num_btn);

	      btn1.addActionListener(this);
	}

	public static HashSet<Integer> lotto_set() {
		//ArrayList<Integer> lotto = new ArrayList<>();
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		
		return lotto;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(lotto_set());
		num_btn.setText(lotto.toString());
		((JButton) e.getSource()).setText("추첨");
		
	}
   public static void main(String[] args) {

      /* 
       	버튼을 누를때 마다 6개의 중복없는 랜덤 숫자를 프레임에 띄우는 프로그램
      */
      
      new S02_Lotto2();

   }

   
   
   

}
