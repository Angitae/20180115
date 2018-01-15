

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//이벤트 핸들러 재활용 가능 => 컴퍼넌트 제어 불가능
public class GUIEvent1 extends Frame {
	private static final long serialVersionUID = 1L;

	public GUIEvent1(String title) {
		super(title);
		
		//버튼 컴퍼넌트를 누른 경우 프로그램 종료
		//이벤트 소스 => 버튼
		Button button=new Button("프로그램 종료");
		setLayout(new FlowLayout());
		add(button);
		
		//이벤트 소스에서 이벤트가 발생될 경우 이벤트 핸들러의
		//메소드가 호출되도록 작성
		// => addActionListener(이벤트 핸들러 인스턴스) 메소드 호출
		button.addActionListener(new ButtonEventHandler());
		
		setBounds(400, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEvent1("Event");
	}
}

//이벤트 핸들러 : 이벤트를 처리하기 위한 메소드가 선언된 클래스
//버튼을 누르는 이벤트 : ActionEvent 발생 
// => ActionListener(인터페이스)를 상속받아 이벤트 처리 
class ButtonEventHandler implements ActionListener {
	//Listener 인터페이스의 메소드를 오버라이드하여 이벤트 처리
	// => 이벤트가 감지될 경우 이벤트 처리 메소드 자동 호출
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}