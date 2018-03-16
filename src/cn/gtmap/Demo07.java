package cn.gtmap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo07 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("战斗暴龙兽");
		f.setSize(400, 300);
		f.setLocation(580,200);
		f.setLayout(null);
		
		final JLabel l = new JLabel();
		ImageIcon i = new ImageIcon("D:/project/Swing/src/img/zz_heiheihei.jpg");
		l.setIcon(i);
		l.setBounds(50,50,i.getIconWidth(), i.getIconHeight());
		
		JButton b = new JButton("隐藏图片");
		b.setBounds(150,200,100,30);
		
		// 给按钮 增加 监听
		b.addActionListener(new ActionListener() {

            // 当按钮被点击时，就会触发 ActionEvent事件
            // actionPerformed 方法就会被执行
			boolean hide = false;
			@Override
			public void actionPerformed(ActionEvent e) {
				l.setVisible(hide);
				hide = !hide;
				b.setText(hide?"显示图片":"隐藏图片");
			}
		});
		
		f.add(l);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
