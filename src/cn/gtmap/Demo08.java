package cn.gtmap;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo08 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("ս��������");
		f.setSize(400, 300);
		f.setLocation(580,200);
		f.setLayout(null);
		
		final JLabel l = new JLabel();
		
		ImageIcon i = new ImageIcon("D:/project/Swing/src/img/zz_heiheihei.jpg");
		
		l.setIcon(i);
		l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
		
		//���Ӽ��̼���
		f.addKeyListener(new KeyListener() {
			
			//һ�����µ������϶���
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			// ��������
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			//��������
			@Override
			public void keyPressed(KeyEvent e) {
				int step = 10;
				
				// ͼƬ�����ƶ� ��x���겻�䣬y������٣�
				if(e.getKeyCode() == 38){
					
					l.setLocation(l.getX(),l.getY() - step);
				}
				
				// ͼƬ�����ƶ� ��x���겻�䣬y�������ӣ�
				if(e.getKeyCode() == 40){
					l.setLocation(l.getX(), l.getY() + step);
				}
				
				// ͼƬ�����ƶ� ��y���겻�䣬x������٣�
				if(e.getKeyCode() == 37){
					l.setLocation(l.getX() - step, l.getY());
				}
				
				// ͼƬ�����ƶ� ��y���겻�䣬x�������ӣ�
				if(e.getKeyCode() == 39){
					l.setLocation(l.getX() + step, l.getY());
				}
				
			}
		});
		
		f.add(l);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
}
