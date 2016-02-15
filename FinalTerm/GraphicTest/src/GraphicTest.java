import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GraphicTest {
   private JPanel panel1, panel2;
   private JButton up, down, left, right;
   private JFrame frame;
   private ImageIcon backImg = null;
 
   static int x;
   static int y;
 
   // �����ڿ� �ʿ� �׸� ���� ���� �� �ʱ�ȭ ����
   public GraphicTest() {
     
      // ��ü ������ ���
      frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(null);
 
      // ��ư ��ü�鿡 ���� ���
      up = new JButton("��");
      down = new JButton("��");
      left = new JButton("��");
      right = new JButton("��");
 
      // ��ư Ŭ���� ���� �̺�Ʈ ������ ����
      up.addActionListener(new up_buttonListener());
      down.addActionListener(new down_buttonListener());
      left.addActionListener(new left_buttonListener());
      right.addActionListener(new right_buttonListener());
 
      // �г�1 ��ü ��� �� �г�1�� ��ư �߰�
      panel1 = new JPanel();
      panel1.add(up);
      panel1.add(down);
      panel1.add(left);
      panel1.add(right);
 
      panel1.setBounds(0, 0, 120, 80);
      panel1.setVisible(true);
 
      // �̹��� ���
      backImg = new ImageIcon("C:/Users/��ȣ��/Pictures");
     
      // �г�2 ��ü ��� �� �г�2�� �̹��� �߰�
      panel2 = new JPanel() {
         public void paintComponent(Graphics g) {
            g.drawImage(backImg.getImage(), 0, 0, 50, 50, null);
         }
      };
     
      panel2.setBounds(120, 80, 300, 300);
      panel2.setVisible(true);
     
      // �����ӿ� �г� �߰�
      frame.add(panel1);
      frame.add(panel2);
 
      frame.setSize(300, 300);
      frame.setVisible(true);
   }
  
   // �� ��ư�� ���� �׼�(��ǥ �̵�)�� ���� Inner Class��
   class up_buttonListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         y = y - 10;
         panel2.setLocation(x, y);
         frame.repaint();
      }
   }
   class down_buttonListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         y = y + 10;
         panel2.setLocation(x, y);
         frame.repaint();
      }
   }
   class left_buttonListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         x = x - 10;
         panel2.setLocation(x, y);
         frame.repaint();
      }
   }
   class right_buttonListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         x = x + 10;
         panel2.setLocation(x, y);
         frame.repaint();
      }
   }
  
   // ���� Ŭ����
   public static void main(String[] args) {
      x = 120;
      y = 80;
      GraphicTest gt = new GraphicTest();
   }
}