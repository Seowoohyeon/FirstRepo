package swing;

import java.awt.BorderLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class S04_JTable extends JFrame {
	
	public S04_JTable() {
		
		setLayout(new BorderLayout());
		
		String data[][] = {
				{"100", "Smitn", "3500", "10"},
				{"101", "King", "4500", "30"},
				{"102", "Steve", "50000", "10"},
				{"103", "Ryo", "30", "10"},
		};
		
		String[] column = {"ID", "NAME", "SALARY", "DEPTNO"};
		JTable table = new JTable(15, 4);
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(data[0]);
		model.addRow(data[1]);
		model.addRow(data[2]);
		model.addRow(data[3]);
		
		
		add(table, BorderLayout.CENTER);
		add(new JButton("Hello"), BorderLayout.SOUTH);
		
		// adapter를 쓰는이유 : 다른 동작들을 구현하지 않고 내가 쓰고 싶은 메서드만 구현하기 위해
		addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				java.awt.Component com = e.getComponent();
				System.out.println("------------------------------");
				System.out.println("location - (" +com.getX()+", " + com.getY() + ")");
				System.out.println("size - (" +com.getWidth()+", " + com.getHeight() + ")");
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S04_JTable();
	}
}
