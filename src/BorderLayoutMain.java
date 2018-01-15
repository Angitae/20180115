
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutMain extends Frame {
	private static final long serialVersionUID = 1L;
	
	public BorderLayoutMain(String title) {
		super(title);
		
		//Button ���۳�Ʈ ����
		Button btn1=new Button("��ư-1");
		Button btn2=new Button("��ư-2");
		Button btn3=new Button("��ư-3");
		Button btn4=new Button("��ư-4");
		Button btn5=new Button("��ư-5");
		
		//�����̳�.setLayout(LayoutManager) : �����̳��� LayoutManager�� �����ϴ� �޼ҵ�
		// => Frame �����̳��� Default LayoutManager�� BorderLayout�̹Ƿ� ���� ����
		//BorderLayout : ���������߾ӿ� ���۳�Ʈ�� ��ġ�ϴ� LayoutManager Ŭ���� 
		//setLayout(new BorderLayout());
		
		//�����̳�.add(���۳�Ʈ[,������ġ]) : �����̳��� ���۳�Ʈ ����
		// => ������ġ�� BorderLayout�� ��쿡�� ���(�⺻:�߾�)
		add(btn1,BorderLayout.CENTER);
		add(btn2,BorderLayout.EAST);
		add(btn3,BorderLayout.WEST);
		add(btn4,BorderLayout.SOUTH);
		add(btn5,BorderLayout.NORTH);
		
		setBounds(400, 100, 400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutMain("BorderLayout");
	}
}



