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
		  - 동서남북과 가운데로 이루어진 레이아웃
		  - 컴포넌트를 추가할 때 위치를 함께 지정해 줄 수 있다
	*/
	JButton quit = new JButton("Quit");
	JButton save = new JButton("Save");
	JButton load = new JButton("Load");
	JButton del = new JButton("Delete");
	JButton up = new JButton("Update");
	
	public S02_BorderLayout() {
		// 이 프레임의 레이아웃 설정
		setLayout(new BorderLayout());
		
		// 버튼의 폰트 설정
		quit.setFont(new Font("궁서체", Font.BOLD, 35));
		
		// 버튼의 이벤트를 추가
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
		
		// 프레임 위치설정
		setLocation(500, 50);
		// 프레임 크기 설정
		setSize(500,600);
		// x버튼을 눌렀을 때의 동작 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임을 보이게 설정(화면에 그린다)
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new S02_BorderLayout();
	
	}

	public void actionPerformed(ActionEvent e) {
		// 해당 컴포넌트에 액션이 발생시  e로 이벤트 당시의 정보가 넘어온다
		/*System.out.println("눌린 정보1 : " + e.getActionCommand());
		System.out.println("눌린 정보2  : " + e.getID());
		System.out.println("눌린 정보3  : " + e.getModifiers());
		System.out.println("눌린 정보4  : " + e.getWhen());
		System.out.println("눌린 정보5  : " + e.getSource());
		System.out.println("---------------------------------------");*/
		
		// e.getSource()에는 액션이 발생한 컴포넌트의 인스턴스가 들어있고
		// 다운캐스팅 하여 사용해야 한다
		if (e.getSource() == quit) {
			((JButton)e.getSource()).setText("나가기");
			System.out.println("나가기로 바귐");
		} else if(e.getSource() == save) {
			((JButton)e.getSource()).setText("저장");
			System.out.println("저장으로 바귐");
		} else if(e.getSource() == load) {
			((JButton)e.getSource()).setText("불러오기");
			System.out.println("불러오기로 바귐");
		} else if(e.getSource() == del) {
			((JButton)e.getSource()).setText("삭제");
			System.out.println("삭제로 바귐");
		} else {
			((JButton)e.getSource()).setText("업데이트");
			System.out.println("업데이트로 바귐");
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
