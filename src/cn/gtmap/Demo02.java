package cn.gtmap;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo02 {

	public static void main(String[] args) {
		
		//主窗口
		JFrame f = new JFrame("LoL");
		
		// 主窗体设置位置
		f.setSize(400, 300);
		
		// 主窗体设置位置
		Point p = getPointFromeLocationFile();
		if(p != null)
			f.setLocation(p.x,p.y);
		else
			f.setLocation(200, 200);
		
		// 主窗体中的组件设置为绝对定位
		f.setLayout(null);
		
		// 按钮组件
		JButton b = new JButton("一键秒对方基地挂");
		
		// 同时设置组件的大小和位置
		b.setBounds(50, 50, 280, 30);
		
		// 把按钮加入到主窗体中
		f.add(b);
		
		// 关闭窗体的时候，退出程序
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 让窗体变得可见
		f.setVisible(true);
		
		new SavingPostionThread(f).start();
	}
	
	static class Point{
		int x;
		int y;
	}
	
	public static Point getPointFromeLocationFile(){
		
		File file = new File("D:/project/Swing/src/cn/gtmap/location.txt");
		Point p = null;
		
		try(
				FileInputStream fis = new FileInputStream(file);
				DataInputStream dis = new DataInputStream(fis);		
		)
		{
			int x = dis.readInt();
			int y = dis.readInt();
			p = new Point();
			p.x = x;
			p.y = y;
		} catch (FileNotFoundException e) {
			//第一次运行，并没有生成位置文件，所以会出现FileNotFoundException
			e.printStackTrace();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		return p;
	}
	
	
	
}
