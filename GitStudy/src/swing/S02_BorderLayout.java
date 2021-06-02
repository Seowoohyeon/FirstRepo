package swing;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_BorderLayout extends JFrame implements ActionListener {
	/*
		# BorderLayout
		  - �������ϰ� ����� �̷���� ���̾ƿ�
		  - ������Ʈ�� �߰��� �� ��ġ�� �Բ� ������ �� �� �ִ�
	*/
	JButton quit = new JButton("Quit");
	JButton save = new JButton("Save");
	JButton load = new JButton("Load");
	JButton del = new JButton("Delete");
	JButton up = new JButton("Update");
	
	public S02_BorderLayout() {
		// �� �������� ���̾ƿ� ����
		setLayout(new BorderLayout());
		
		// ��ư�� ��Ʈ ����
		quit.setFont(new Font("�ü�ü", Font.BOLD, 35));
		
		// ��ư�� �̺�Ʈ�� �߰�
		quit.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);
		del.addActionListener(this);
		up.addActionListener(this);
			
		add(save, BorderLayout.CENTER);
		add(load, BorderLayout.EAST);
		add(del, BorderLayout.WEST);
		add(up, BorderLayout.NORTH);
		add(quit, BorderLayout.SOUTH);
		
		// ������ ��ġ����
		setLocation(500, 50);
		// ������ ũ�� ����
		setSize(500,600);
		// x��ư�� ������ ���� ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �������� ���̰� ����(ȭ�鿡 �׸���)
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new S02_BorderLayout();
	
	}

	public void actionPerformed(ActionEvent e) {
		// �ش� ������Ʈ�� �׼��� �߻���  e�� �̺�Ʈ ����� ������ �Ѿ�´�
		/*System.out.println("���� ����1 : " + e.getActionCommand());
		System.out.println("���� ����2  : " + e.getID());
		System.out.println("���� ����3  : " + e.getModifiers());
		System.out.println("���� ����4  : " + e.getWhen());
		System.out.println("���� ����5  : " + e.getSource());
		System.out.println("---------------------------------------");*/
		
		// e.getSource()���� �׼��� �߻��� ������Ʈ�� �ν��Ͻ��� ����ְ�
		// �ٿ�ĳ���� �Ͽ� ����ؾ� �Ѵ�
		if (e.getSource() == quit) {
			((JButton)e.getSource()).setText("������");
			System.out.println("������� �ٱ�");
		} else if(e.getSource() == save) {
			((JButton)e.getSource()).setText("����");
			System.out.println("�������� �ٱ�");
		} else if(e.getSource() == load) {
			((JButton)e.getSource()).setText("�ҷ�����");
			System.out.println("�ҷ������ �ٱ�");
		} else if(e.getSource() == del) {
			((JButton)e.getSource()).setText("����");
			System.out.println("������ �ٱ�");
		} else {
			((JButton)e.getSource()).setText("������Ʈ");
			System.out.println("������Ʈ�� �ٱ�");
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
