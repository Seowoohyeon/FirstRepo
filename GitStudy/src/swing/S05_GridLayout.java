package swing;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;

public class S05_GridLayout extends MyFrame{
	
	public S05_GridLayout() {
		ArrayList<JButton> btns = new ArrayList<>(14);
		
		for (int i = 0; i < 14; i++) {
			btns.add(new JButton("Button " +i));
		}
		
		setLayout(new GridLayout(2,7,5,5));
		
		for(JButton btn : btns) {
			add(btn);
		}
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S05_GridLayout();
	}
}
