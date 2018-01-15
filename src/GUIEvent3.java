

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//�پ��� �̺�Ʈ ó���� �����ϸ� ���۳�Ʈ ���� ����
public class GUIEvent3 extends Frame {
	private static final long serialVersionUID = 1L;
	
	public GUIEvent3(String title) {
		super(title);
		
		Button button=new Button("���α׷� ����");
		setLayout(new FlowLayout());
		add(button);
		
		button.addActionListener(new ButtonInnerEventHandler());
		
		setBounds(400, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEvent3("Event");
	}
	
	//Inner Class : Ŭ���� �ȿ� ����� Ŭ����
	// => Outer Class(�ܺ�Ŭ����)�� �ʵ� �� �޼ҵ� ���� ����
	public class ButtonInnerEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}