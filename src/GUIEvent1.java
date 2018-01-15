

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//�̺�Ʈ �ڵ鷯 ��Ȱ�� ���� => ���۳�Ʈ ���� �Ұ���
public class GUIEvent1 extends Frame {
	private static final long serialVersionUID = 1L;

	public GUIEvent1(String title) {
		super(title);
		
		//��ư ���۳�Ʈ�� ���� ��� ���α׷� ����
		//�̺�Ʈ �ҽ� => ��ư
		Button button=new Button("���α׷� ����");
		setLayout(new FlowLayout());
		add(button);
		
		//�̺�Ʈ �ҽ����� �̺�Ʈ�� �߻��� ��� �̺�Ʈ �ڵ鷯��
		//�޼ҵ尡 ȣ��ǵ��� �ۼ�
		// => addActionListener(�̺�Ʈ �ڵ鷯 �ν��Ͻ�) �޼ҵ� ȣ��
		button.addActionListener(new ButtonEventHandler());
		
		setBounds(400, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEvent1("Event");
	}
}

//�̺�Ʈ �ڵ鷯 : �̺�Ʈ�� ó���ϱ� ���� �޼ҵ尡 ����� Ŭ����
//��ư�� ������ �̺�Ʈ : ActionEvent �߻� 
// => ActionListener(�������̽�)�� ��ӹ޾� �̺�Ʈ ó�� 
class ButtonEventHandler implements ActionListener {
	//Listener �������̽��� �޼ҵ带 �������̵��Ͽ� �̺�Ʈ ó��
	// => �̺�Ʈ�� ������ ��� �̺�Ʈ ó�� �޼ҵ� �ڵ� ȣ��
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}