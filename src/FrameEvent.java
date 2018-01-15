

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Frame���� �ݱ��ư�� ������ ���α׷� ����ǵ��� �ۼ�
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
		System.out.println("windowOpened() �޼ҵ� ����");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing() �޼ҵ� ����");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed() �޼ҵ� ����");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified() �޼ҵ� ����");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified() �޼ҵ� ����");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated() �޼ҵ� ����");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated() �޼ҵ� ����");
	}
	*/
}
