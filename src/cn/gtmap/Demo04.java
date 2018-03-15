package cn.gtmap;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo04 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("战斗暴龙兽");
		f.setSize(700, 600);
		f.setLocation(100,100);
		f.setLayout(null);
		
		final JLabel l = new JLabel();
		
		ImageIcon i = new ImageIcon("D:/project/Swing/src/img/zz.jpg");
		l.setIcon(i);
		l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
		
		// 增加键盘监听
		f.addKeyListener(new KeyListener(){
			
			// 一个按下弹起的组合动作
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			//键被按下
			@Override
			public void keyPressed(KeyEvent e) {
				// 键被弹起
				if(e.getKeyCode() == 39){
					// 图片向右移动 （y坐标不变，x坐标增加）
					l.setLocation(l.getX() + 10,l.getY());
				}
				
			}
			
			// 键被弹起
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
