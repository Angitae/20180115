

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//������ �̺�Ʈ ó��
public class GUIEvent4 extends Frame {
	private static final long serialVersionUID = 1L;
	
	public GUIEvent4(String title) {
		super(title);
		
		Button button=new Button("���α׷� ����");
		setLayout(new FlowLayout());
		add(button);
		
		//Anonymous Inner Class : �߻�Ŭ���� �Ǵ� �������̽���
		//�޼ҵ带 �������̵� ���� �� �̸��� ���� Ŭ������ �ν��Ͻ� ����
		// => �߻�Ŭ���� �Ǵ� �������̽��� ��ӹ޾� �ν��Ͻ��� �ϳ��� ������ ��� ���
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(400, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEvent4("Event");
	}
}
