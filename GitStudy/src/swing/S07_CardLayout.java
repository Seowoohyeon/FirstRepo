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
   		  - ������Ʈ�� ī��ó�� �ѱ�鼭 ����ϴ� ���̾ƿ�
   */
   
   public S07_CardLayout() {
      
      setLayout(new BorderLayout());
      
      JPanel center = new JPanel();
      JPanel south = new JPanel();
      
      //JLabel : ������ �׳� ����ϴ� ��
      JLabel label1 = new JLabel("Hello!");
      JLabel label2 = new JLabel("Nice to meet you!");
      JLabel label3 = new JLabel("Good Bye!");
      
      // ī�� ���̾ƿ��� ������Ʈ�� �߰��� ���� ������Ʈ�� �̸��� ������ ���� ���� ����
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
            //card.next(center); // ���� ī��� �ѱ�� (���̾ƿ��� ������ �����̳��� �ν��Ͻ��� �ʿ��ϴ�_)s
            // ���ϴ� ī�� ����
            //card.show(center, "card3");
            // previous : ���� ī�� ����
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
