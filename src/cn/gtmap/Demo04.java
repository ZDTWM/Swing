package cn.gtmap;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo04 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("ս��������");
		f.setSize(700, 600);
		f.setLocation(100,100);
		f.setLayout(null);
		
		final JLabel l = new JLabel();
		
		ImageIcon i = new ImageIcon("D:/project/Swing/src/img/zz.jpg");
		l.setIcon(i);
		l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
		
		// ���Ӽ��̼���
		f.addKeyListener(new KeyListener(){
			
			// һ�����µ������϶���
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			//��������
			@Override
			public void keyPressed(KeyEvent e) {
				// ��������
				if(e.getKeyCode() == 39){
					// ͼƬ�����ƶ� ��y���겻�䣬x�������ӣ�
					l.setLocation(l.getX() + 10,l.getY());
				}
				
			}
			
			// ��������
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		f.add(l);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
