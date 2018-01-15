

import java.awt.Frame;

public class FrameMain extends Frame {
	private static final long serialVersionUID = 1L;
	
	//원하는 형태에 프레임을 구현하여 출력
	public FrameMain(String title) {
		super(title);
		
		/*
		//setSize(폭,높이) : 컴퍼넌트의 크기(Pixel)를 변경하는 메소드
		setSize(300, 400);
		
		//setLocation(X,Y) : 컴퍼넌트의 출력위치를 변경하는 메소드
		setLocation(500, 100);
		*/
		//컴퍼넌트의 출력위치 및 크기를 변경하는 메소드
		setBounds(500, 100, 300, 400);
		
		//setVisible(boolean) : 컴퍼넌트의 출력유무를 결정하는 메소드
		setVisible(true);
	}

	public static void main(String[] args) {
		new FrameMain("GUI");
	}
}