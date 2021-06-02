package swing;

import javax.swing.*;

public class S01_JavaSwing {
	
	/*
	 	# Swing
	 	  - Java로 윈도우 GUI 프로그램을 만들 수 있는 GUI
	 	  
	 	# Container
	 	  - 컴포넌트를 추가할 수 있는 판
	 	  - JFrame, JPanel.....
	 	  - 컨테이너마다 원하는 레이아웃을 지정할 수 있다
	 	  
	 	# Component
	 	  - 컨테이너에 추가할 수 있는 부품
	 	  - JButton, JTable.....
	*/
	
	public static void main(String[] args) {
		/*
		 	# JFrame
		 	  - 프레임 컨테이너. 다양한 컴포넌트들을 추가할 수 있다
		*/
		JFrame jf = new JFrame();
		JButton btn1 = new JButton("This is button");
		
		btn1.setLocation(100, 100);
		btn1.setSize(200, 50);
		
		jf.add(btn1);
		
		jf.setLocation(500, 50);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500, 500);
		jf.setVisible(true);
		
		
		
		
	}
}
