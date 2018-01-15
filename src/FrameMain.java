

import java.awt.Frame;

public class FrameMain extends Frame {
	private static final long serialVersionUID = 1L;
	
	//���ϴ� ���¿� �������� �����Ͽ� ���
	public FrameMain(String title) {
		super(title);
		
		/*
		//setSize(��,����) : ���۳�Ʈ�� ũ��(Pixel)�� �����ϴ� �޼ҵ�
		setSize(300, 400);
		
		//setLocation(X,Y) : ���۳�Ʈ�� �����ġ�� �����ϴ� �޼ҵ�
		setLocation(500, 100);
		*/
		//���۳�Ʈ�� �����ġ �� ũ�⸦ �����ϴ� �޼ҵ�
		setBounds(500, 100, 300, 400);
		
		//setVisible(boolean) : ���۳�Ʈ�� ��������� �����ϴ� �޼ҵ�
		setVisible(true);
	}

	public static void main(String[] args) {
		new FrameMain("GUI");
	}
}