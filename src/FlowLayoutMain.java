

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutMain extends Frame {
	private static final long serialVersionUID = 1L;
	
	public FlowLayoutMain(String title) {
		super(title);
		
		Button btn1=new Button("버튼-1");
		Button btn2=new Button("버튼-2");
		Button btn3=new Button("버튼-3");
		Button btn4=new Button("버튼-4");
		Button btn5=new Button("버튼-5");
		
		//Frame LayoutManager : BorderLayout(기본) > FlowLayout
		//FlowLayout : 컴퍼넌트를 왼쪽에서 오른쪽으로 차례대로 부착
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




