package swing;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import swing.quiz.S03_KakaoImageButton;

public class S03_JButton extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public S03_JButton() {
		setLayout(null);
		JButton btn1 = new JButton("눌러보세여");
		ImageIcon icon = new ImageIcon("./data/kakao.jpg");
		Image img = icon.getImage();
		Image cimg = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon cicon = new ImageIcon(cimg);
		
		
		btn1.setBounds(100, 100, 300, 200);
		
		btn1.setText("Push this Button");
		
		// 해당 컴포넌트를 활성화/비활성화
		btn1.setEnabled(true);
		
		btn1.setBackground(new Color(255,255,0));
		
		// 해당 컴포넌트의 아이콘을 설정한다
		btn1.setIcon(cicon);
		add(btn1);
		add(new S03_KakaoImageButton(S03_KakaoImageButton.APEACH, 100, 300, 100, 100));
		setLocation(500, 50);
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S03_JButton();
	
	}
}
