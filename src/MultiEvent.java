

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//�����ư�� ������ �ش� ��ư���� ������ �������� TextArea ���۳�Ʈ�� ���� ����
//���α׷� ���� MenuItem�� �����ϸ� ���α׷� ����
//TextField ������ ���ڿ� �Է� �� ���͸� ������ TextArea ������ ���
public class MultiEvent extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	//�̺�Ʈ ���� ���۳�Ʈ�� �ʵ�� �����Ͽ� ���
	Button btn1,btn2,btn3;
	TextArea ta;
	TextField tf;
	
	public MultiEvent(String title) {
		super(title);
		
		//�޴��� �����Ͽ� Frame�� ����
		MenuBar bar=new MenuBar();
		Menu menu=new Menu("����");
		MenuItem item=new MenuItem("���α׷� ����");
		menu.add(item);
		bar.add(menu);
		setMenuBar(bar);
		
		//Button ���۳�Ʈ�� Text ����Ÿ�� �⺻ ActionCommand�� ����
		btn1=new Button("������");
		btn2=new Button("�ʷϻ�");
		btn3=new Button("�Ķ���");
		
		//setActionCommand(String) : ActionCommand�� �����ϴ� �޼ҵ�
		btn1.setActionCommand("RED");
		btn2.setActionCommand("GREEN");
		btn3.setActionCommand("BLUE");
		
		Panel panel=new Panel();
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		ta=new TextArea();
		tf=new TextField();

		btn1.setBackground(new Color(255, 0, 0));
		btn2.setBackground(Color.GREEN);
		btn3.setBackground(Color.BLUE);
		panel.setBackground(Color.GRAY);
		tf.setBackground(Color.BLACK);
		
		tf.setForeground(Color.WHITE);
		
		ta.setFont(new Font("����", Font.PLAIN, 20));		
		tf.setFont(new Font("�ü�", Font.BOLD+Font.ITALIC, 16));		
		panel.setFont(new Font("����", Font.BOLD, 16));
		
		ta.setFocusable(false);
		
		add(panel,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		setResizable(false);
		
		//�̺�Ʈ �߻��� �̺�Ʈ ó�� �ڵ鷯 �ν��Ͻ��� �޼ҵ� ȣ��
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		tf.addActionListener(this);
		item.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(400, 100, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MultiEvent("Event");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//ActionEvent e : �̺�Ʈ ���� �ν��Ͻ� ������ ����� ��������
		/*
		//getActionCommand() : ActionCommand�� ��ȯ�ϴ� �޼ҵ�
		//ActionCommand : ActionEvent�� �߻��ϴ� �̺�Ʈ �ҽ��� �ο��� ������
		String actionCommand=e.getActionCommand();
		
		if(actionCommand.equals("RED")) {
			ta.setBackground(Color.RED);
		} else if(actionCommand.equals("GREEN")) {
			ta.setBackground(Color.GREEN);
		} else if(actionCommand.equals("BLUE")) {
			ta.setBackground(Color.BLUE);
		}
		*/
		//getSource() : �̺�Ʈ�� �߻��� ���۳�Ʈ�� ��ȯ�ϴ� �޼ҵ�
		Object eventSource=e.getSource();
		
		if(eventSource instanceof Button) {
			if(eventSource==btn1) {
				ta.setBackground(Color.RED);
			} else if(eventSource==btn2) {
				ta.setBackground(Color.GREEN);
			} else if(eventSource==btn3) {
				ta.setBackground(Color.BLUE);
			}
		} else if(eventSource instanceof TextField) {
			//getText() : ���۳�Ʈ�� ���ڿ��� ��ȯ�ϴ� �޼ҵ� 
			String message=tf.getText();
			if(!message.equals("")) {//�Է� ���ڿ��� ������ ���
				//append(String) : TextArea ���۳�Ʈ�� ���ڿ��� �߰��ϴ� �޼ҵ�
				ta.append(message+"\n");
				//setText(String) : ���۳�Ʈ�� ���ڿ��� �����ϴ� �޼ҵ�
				tf.setText("");
			}
		} else if(eventSource instanceof MenuItem) {
			System.exit(0);
		}
	}
}












