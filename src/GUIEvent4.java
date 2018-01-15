

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//간단한 이벤트 처리
public class GUIEvent4 extends Frame {
	private static final long serialVersionUID = 1L;
	
	public GUIEvent4(String title) {
		super(title);
		
		Button button=new Button("프로그램 종료");
		setLayout(new FlowLayout());
		add(button);
		
		//Anonymous Inner Class : 추상클래스 또는 인터페이스의
		//메소드를 오버라이드 선언 후 이름이 없는 클래스로 인스턴스 생성
		// => 추상클래스 또는 인터페이스를 상속받아 인스턴스를 하나만 생성할 경우 사용
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
