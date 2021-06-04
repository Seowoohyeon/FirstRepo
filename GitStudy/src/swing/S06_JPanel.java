package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class S06_JPanel extends MyFrame{
	
	JPanel main_jp;
	JPanel sub_jp;
	
	public S06_JPanel() {
		/*
			- 컨테이너 역할을 하는 컴포넌트
			- 프레임 위에 붙여서 사용하는 컨테이너
			- 레이아웃도 설정할 수 있다
		*/
		setLayout(new BorderLayout());
		
		ArrayList<JButton> main_jp_btn = new ArrayList<>();
		ArrayList<JButton> sub_jp_btn = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			main_jp_btn.add(new JButton("Button " +i));
		}
		for (int i = 0; i < 10; i++) {
			sub_jp_btn.add(new JButton("Sub " +i));
		}
		
		
		main_jp = new JPanel();
		sub_jp = new JPanel();
		
		main_jp.setBackground(Color.MAGENTA);
		main_jp.setLayout(new GridLayout(2,2,2,2));
		for (int i = 0; i < 4; i++) {
			main_jp.add(main_jp_btn.get(i));
		}
		
		sub_jp.setBackground(Color.ORANGE);
		sub_jp.setLayout(new GridLayout(5,2,3,3));
		for (int i = 0; i < 10; i++) {
			sub_jp.add(sub_jp_btn.get(i));
		}
		
		add(main_jp, BorderLayout.CENTER);
		add(sub_jp, BorderLayout.WEST);
		add(new JButton("Hi"), BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new S06_JPanel();
	}
}
