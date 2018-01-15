

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class PanelMain extends Frame {
	private static final long serialVersionUID = 1L;

	public PanelMain(String title) {
		super(title);
		
		//Frame ���ʿ� ������ ���۳�Ʈ ����
		Button btn1=new Button("������");
		Button btn2=new Button("�ʷϻ�");
		Button btn3=new Button("�Ķ���");
		
		Panel panel=new Panel();
		//Panel �����̳��� Default LayoutManager�� FlowLayout�̹Ƿ� ���� ���� 
		//panel.setLayout(new FlowLayout());
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		//Frame �߾ӿ� ������ ���۳�Ʈ ����
		TextArea ta=new TextArea();
		
		//Frame ���ʿ� ������ ���۳�Ʈ ����
		TextField tf=new TextField();

		//���۳�Ʈ ���� ����
		btn1.setBackground(new Color(255, 0, 0));
		btn2.setBackground(Color.GREEN);
		btn3.setBackground(Color.BLUE);
		panel.setBackground(Color.GRAY);
		tf.setBackground(Color.BLACK);
		
		//���۳�Ʈ ���ڻ� ����
		tf.setForeground(Color.WHITE);
		
		//�۲� �� ũ�� ����
		ta.setFont(new Font("����", Font.PLAIN, 20));		
		tf.setFont(new Font("�ü�", Font.BOLD+Font.ITALIC, 16));		
		panel.setFont(new Font("����", Font.BOLD, 16));
		
		//���۳�Ʈ ��Ȱ��ȭ
		//ta.setEnabled(false);
		//ta.setEditable(false);//TextComponent������ ��� ����
		ta.setFocusable(false);//��Ŀ���� ��ġ���� �ʵ��� ����
		
		//���۳�Ʈ(�����̳�)�� Frame�� ����
		add(panel,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		//Frame ũ�� ���� �Ұ�
		setResizable(false);
		
		setBounds(400, 100, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PanelMain("Panel");
	}
}