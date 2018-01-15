

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//다양한 이벤트 처리가 가능하며 컴퍼넌트 제어 가능
public class GUIEvent3 extends Frame {
	private static final long serialVersionUID = 1L;
	
	public GUIEvent3(String title) {
		super(title);
		
		Button button=new Button("프로그램 종료");
		setLayout(new FlowLayout());
		add(button);
		
		button.addActionListener(new ButtonInnerEventHandler());
		
		setBounds(400, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEvent3("Event");
	}
	
	//Inner Class : 클래스 안에 선언된 클래스
	// => Outer Class(외부클래스)의 필드 및 메소드 접근 가능
	public class ButtonInnerEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}