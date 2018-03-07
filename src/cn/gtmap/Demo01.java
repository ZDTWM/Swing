package cn.gtmap;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * GUI-Graphic User Interface 图形用户界面
 * @author Administrator
 *
 */
public class Demo01 {
	//JFrame是GUI中的容器 
	//JButton是最常见的组件- 按钮 
	//注意：f.setVisible(true); 会对所有的组件进行渲染，所以一定要放在最后面
	public static void main(String[] args) {
		
		//主窗体
		JFrame f = new JFrame("LOL");
		
		//主窗体设置大小
		f.setSize(400,300);
		
		//主窗体设置位置
		f.setLocation(200,200);
		
		//主窗体中的组件设置为绝对定位
		f.setLayout(null);
		
		//按钮组件
		JButton b = new JButton("一键秒对方基地挂");
		
		//同时设置组件的大小和位置
		b.setBounds(50,50,280,30);
		
		//把按钮加到主窗体中
		f.add(b);
		
		//让窗体变得可见
		f.setVisible(true);
	}

}
