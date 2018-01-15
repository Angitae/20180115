

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutMain extends Frame {
	private static final long serialVersionUID = 1L;

	public GridLayoutMain(String title) {
		super(title);
		
		Button btn1=new Button("��ư-1");
		Button btn2=new Button("��ư-2");
		Button btn3=new Button("��ư-3");
		Button btn4=new Button("��ư-4");
		Button btn5=new Button("��ư-5");
		
		//Frame LayoutManager : BorderLayout(�⺻) > GridLayout
		//GridLayout : �࿭������� ���۳�Ʈ ����
		setLayout(new GridLayout(5,1));
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		setBounds(400, 100, 400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutMain("GridLayout");
	}
}
