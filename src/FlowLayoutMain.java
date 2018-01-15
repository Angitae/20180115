

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutMain extends Frame {
	private static final long serialVersionUID = 1L;
	
	public FlowLayoutMain(String title) {
		super(title);
		
		Button btn1=new Button("��ư-1");
		Button btn2=new Button("��ư-2");
		Button btn3=new Button("��ư-3");
		Button btn4=new Button("��ư-4");
		Button btn5=new Button("��ư-5");
		
		//Frame LayoutManager : BorderLayout(�⺻) > FlowLayout
		//FlowLayout : ���۳�Ʈ�� ���ʿ��� ���������� ���ʴ�� ����
		setLayout(new FlowLayout());
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		setBounds(400, 100, 400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutMain("FlowLayout");
	}
}




