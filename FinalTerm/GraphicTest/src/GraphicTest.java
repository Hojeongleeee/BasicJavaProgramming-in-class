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
 
   // 생성자에 필요 항목에 대한 선언 및 초기화 구현
   public GraphicTest() {
     
      // 전체 프레임 등록
      frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(null);
 
      // 버튼 객체들에 대한 등록
      up = new JButton("△");
      down = new JButton("▽");
      left = new JButton("◁");
      right = new JButton("▷");
 
      // 버튼 클릭에 따른 이벤트 리스너 적용
      up.addActionListener(new up_buttonListener());
      down.addActionListener(new down_buttonListener());
      left.addActionListener(new left_buttonListener());
      right.addActionListener(new right_buttonListener());
 
      // 패널1 객체 등록 및 패널1에 버튼 추가
      panel1 = new JPanel();
      panel1.add(up);
      panel1.add(down);
      panel1.add(left);
      panel1.add(right);
 
      panel1.setBounds(0, 0, 120, 80);
      panel1.setVisible(true);
 
      // 이미지 등록
      backImg = new ImageIcon("C:/Users/이호정/Pictures");
     
      // 패널2 객체 등록 및 패널2에 이미지 추가
      panel2 = new JPanel() {
         public void paintComponent(Graphics g) {
            g.drawImage(backImg.getImage(), 0, 0, 50, 50, null);
         }
      };
     
      panel2.setBounds(120, 80, 300, 300);
      panel2.setVisible(true);
     
      // 프레임에 패널 추가
      frame.add(panel1);
      frame.add(panel2);
 
      frame.setSize(300, 300);
      frame.setVisible(true);
   }
  
   // 각 버튼에 대한 액션(좌표 이동)을 위한 Inner Class들
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
  
   // 메인 클래스
   public static void main(String[] args) {
      x = 120;
      y = 80;
      GraphicTest gt = new GraphicTest();
   }
}