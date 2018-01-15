

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Frame에서 닫기버튼을 누른면 프로그램 종료되도록 작성
public class FrameEvent extends Frame /* implements WindowListener */ {
	private static final long serialVersionUID = 1L;

	public FrameEvent(String title) {
		super(title);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(400, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrameEvent("Event");
	}

	/*
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened() 메소드 실행");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing() 메소드 실행");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed() 메소드 실행");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified() 메소드 실행");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified() 메소드 실행");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated() 메소드 실행");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated() 메소드 실행");
	}
	*/
}
