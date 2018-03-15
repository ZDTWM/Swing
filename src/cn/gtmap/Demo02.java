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
		
		//������
		JFrame f = new JFrame("LoL");
		
		// ����������λ��
		f.setSize(400, 300);
		
		// ����������λ��
		Point p = getPointFromeLocationFile();
		if(p != null)
			f.setLocation(p.x,p.y);
		else
			f.setLocation(200, 200);
		
		// �������е��������Ϊ���Զ�λ
		f.setLayout(null);
		
		// ��ť���
		JButton b = new JButton("һ����Է����ع�");
		
		// ͬʱ��������Ĵ�С��λ��
		b.setBounds(50, 50, 280, 30);
		
		// �Ѱ�ť���뵽��������
		f.add(b);
		
		// �رմ����ʱ���˳�����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �ô����ÿɼ�
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
			//��һ�����У���û������λ���ļ������Ի����FileNotFoundException
			e.printStackTrace();
		} catch(IOException e1){
			e1.printStackTrace();
		}
		return p;
	}
	
	
	
}
