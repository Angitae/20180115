

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//�̺�Ʈ �ڵ鷯 �޼ҵ忡�� ���۳�Ʈ ���� ����
public class GUIEvent2 extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;

	public GUIEvent2(String title) {
		super(title);
		
		Button button=new Button("���α׷� ����");
		setLayout(new FlowLayout());
		add(button);
		
		button.addActionListener(this);
		
		setBounds(400, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEvent2("Event");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
