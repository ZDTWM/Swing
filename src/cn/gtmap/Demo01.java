package cn.gtmap;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * GUI-Graphic User Interface ͼ���û�����
 * @author Administrator
 *
 */
public class Demo01 {
	//JFrame��GUI�е����� 
	//JButton����������- ��ť 
	//ע�⣺f.setVisible(true); ������е����������Ⱦ������һ��Ҫ���������
	public static void main(String[] args) {
		
		//������
		JFrame f = new JFrame("LOL");
		
		//���������ô�С
		f.setSize(400,300);
		
		//����������λ��
		f.setLocation(200,200);
		
		//�������е��������Ϊ���Զ�λ
		f.setLayout(null);
		
		//��ť���
		JButton b = new JButton("һ����Է����ع�");
		
		//ͬʱ��������Ĵ�С��λ��
		b.setBounds(50,50,280,30);
		
		//�Ѱ�ť�ӵ���������
		f.add(b);
		
		//�ô����ÿɼ�
		f.setVisible(true);
	}

}
