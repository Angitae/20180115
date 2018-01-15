
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutMain extends Frame {
	private static final long serialVersionUID = 1L;
	
	public BorderLayoutMain(String title) {
		super(title);
		
		//Button 컴퍼넌트 생성
		Button btn1=new Button("버튼-1");
		Button btn2=new Button("버튼-2");
		Button btn3=new Button("버튼-3");
		Button btn4=new Button("버튼-4");
		Button btn5=new Button("버튼-5");
		
		//컨테이너.setLayout(LayoutManager) : 컨테이너의 LayoutManager를 변경하는 메소드
		// => Frame 컨테이너의 Default LayoutManager가 BorderLayout이므로 변경 생략
		//BorderLayout : 동서남북중앙에 컴퍼넌트를 배치하는 LayoutManager 클래스 
		//setLayout(new BorderLayout());
		
		//컨테이너.add(컴퍼넌트[,부착위치]) : 컨테이너의 컴퍼넌트 부착
		// => 부착위치는 BorderLayout인 경우에만 사용(기본:중앙)
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



