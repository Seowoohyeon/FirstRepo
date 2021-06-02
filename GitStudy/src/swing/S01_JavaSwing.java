package swing;

import javax.swing.*;

public class S01_JavaSwing {
	
	/*
	 	# Swing
	 	  - Java�� ������ GUI ���α׷��� ���� �� �ִ� GUI
	 	  
	 	# Container
	 	  - ������Ʈ�� �߰��� �� �ִ� ��
	 	  - JFrame, JPanel.....
	 	  - �����̳ʸ��� ���ϴ� ���̾ƿ��� ������ �� �ִ�
	 	  
	 	# Component
	 	  - �����̳ʿ� �߰��� �� �ִ� ��ǰ
	 	  - JButton, JTable.....
	*/
	
	public static void main(String[] args) {
		/*
		 	# JFrame
		 	  - ������ �����̳�. �پ��� ������Ʈ���� �߰��� �� �ִ�
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
