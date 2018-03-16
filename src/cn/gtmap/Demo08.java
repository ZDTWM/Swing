package cn.gtmap;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo08 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("战斗暴龙兽");
		f.setSize(400, 300);
		f.setLocation(580,200);
		f.setLayout(null);
		
		final JLabel l = new JLabel();
		
		ImageIcon i = new ImageIcon("D:/project/Swing/src/img/zz_heiheihei.jpg");
		
		l.setIcon(i);
		l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
		
		//增加键盘监听
		f.addKeyListener(new KeyListener() {
			
			//一个按下弹起的组合动作
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			// 键被弹起
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			//键被按下
			@Override
			public void keyPressed(KeyEvent e) {
				int step = 10;
				
				// 图片向上移动 （x坐标不变，y坐标减少）
				if(e.getKeyCode() == 38){
					
					l.setLocation(l.getX(),l.getY() - step);
				}
				
				// 图片向下移动 （x坐标不变，y坐标增加）
				if(e.getKeyCode() == 40){
					l.setLocation(l.getX(), l.getY() + step);
				}
				
				// 图片向左移动 （y坐标不变，x坐标减少）
				if(e.getKeyCode() == 37){
					l.setLocation(l.getX() - step, l.getY());
				}
				
				// 图片向右移动 （y坐标不变，x坐标增加）
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
