package swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class S07_CardLayout extends MyFrame {
   
   /* 
   		# CardLayout
   		  - 컴포넌트를 카드처럼 넘기면서 사용하는 레이아웃
   */
   
   public S07_CardLayout() {
      
      setLayout(new BorderLayout());
      
      JPanel center = new JPanel();
      JPanel south = new JPanel();
      
      //JLabel : 내용을 그냥 출력하는 곳
      JLabel label1 = new JLabel("Hello!");
      JLabel label2 = new JLabel("Nice to meet you!");
      JLabel label3 = new JLabel("Good Bye!");
      
      // 카드 레이아웃에 컴포넌트를 추가할 때는 컴포넌트의 이름을 지정해 놓는 것이 좋다
      center.setLayout(new CardLayout(5, 5));
      center.add("card1", label1);
      center.add("card2", label2);
      center.add("card3", label3);
      
      
      
      JButton prev = new JButton("prev");
      JButton next = new JButton("next");
      next.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            
            CardLayout card = (CardLayout) center.getLayout();
            //card.next(center); // 다음 카드로 넘기기 (레이아웃이 설정된 컨테이너의 인스턴스가 필요하다_)s
            // 원하는 카드 보기
            //card.show(center, "card3");
            // previous : 이전 카드 보기
            card.next(center);
            
            if(!label1.isVisible()) {
            	card.previous(center);
            }
            
         }
      });
      
      south.setLayout(new GridLayout(1, 2));
      south.add(prev);
      south.add(next);
      
      add(center, BorderLayout.CENTER);
      add(south, BorderLayout.SOUTH);
      
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new S07_CardLayout();
   }

}
