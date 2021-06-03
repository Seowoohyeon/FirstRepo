package swing.quiz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_Lotto extends JFrame implements ActionListener {
	
	JButton ran = new JButton("랜덤번호생성");
	JButton num = new JButton("로또번호");
	
	public S02_Lotto() {
		setLayout(new BorderLayout());
		ran.addActionListener(this);
		num.addActionListener(this);
		add(ran, BorderLayout.EAST);
		add(num, BorderLayout.WEST);
		setLocation(500, 50);
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new S02_Lotto();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*if (e.getSource() == ran) {
			int lotto[] = new int [6];
			
			for(int i=0; i<6; i++) {
				lotto[i] = (int)(Math.random() * 45) + 1;
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}

			for(int i=0; i<6; i++) {
				((JButton)e.getSource()).setText(lotto[i]+"");
			}
		}*/
		int num=0;

        for (int i = 0; i < 6; i++) {

           num = (int)(Math.random()*45+1);
           ((JButton)e.getSource()).setText(num+"");
        }
		
	}
}
